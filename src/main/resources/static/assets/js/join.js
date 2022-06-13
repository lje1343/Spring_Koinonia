// 비밀번호 보기/감추기
$("#pw + button").click(() => {
  let eye = $("#pw + button").children("img");
  let see = "../../static/images/eye_see.png";
  let nosee = "../../static/images/eye_nosee.png";
  if (eye.attr("src") == see) {
    eye.attr("src", nosee);
    $("#pw").attr("type", "text");
  } else {
    eye.attr("src", see);
    $("#pw").attr("type", "password");
  }
});

//////////////////////////////////////////////////////
// 유효성 검사
// null 여부 확인
const isNull = (target) => {
  console.log(target.val().length);
  if (target.val() == null || target.val().length == 0) {
    return true;
  } else {
    return false;
  }
};
// 구성 조건
let spc = /[~!@#$%^&*()_+|<>?:{}]/;
let pw = /^(?=.*[a-zA-Z])(?=.*[0-9]).{4,12}$/;
let email =
  /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
// 중복 확인
const checkDuplication = (target) => {
  target.on("change", () => {
    joinService.checkDuplication(target.val(), (result) => {
      if (result) {
        // 사용가능
      } else {
        // 중복
      }
    });
  });
};

const checkName = () => {
  // null 여부 확인
  console.log(isNull($("#name")));
  if (isNull($("#name"))) {
    console.log(isNull($("#name")));
    $("#name").attr("style", "border-color:#e00751;");
    $("#nameGuidMsg").text("이름을 입력해주세요.");
    $("#nameGuidMsg").attr("style", "display:block;");
  } else {
    $("#name").removeAttr("style");
    $("#nameGuidMsg").removeAttr("style");
  }
  // 구성 조건
  if (spc.test($("#name").val())) {
    $("#name").attr("style", "border-color:#e00751;");
    $("#nameGuidMsg").text("이름에는 특수문자를 사용할 수 없습니다.");
    $("#nameGuidMsg").attr("style", "display:block;");
  } else {
    $("#name").removeAttr("style");
    $("#nameGuidMsg").removeAttr("style");
  }
  // if ($("#name").val().length < 2 || $("#name").val().length > 12) {
  //   console.log("s");
  //   $("#name").attr("style", "border-color:#e00751;");
  //   $("#nameGuidMsg").text("이름은 2자이상 12자이하만 가능합니다.");
  //   $("#nameGuidMsg").attr("style", "display:block;");
  // }
  // 중복 확인
  // joinService.checkDuplication($("#name").val(), (result) => {
  //   if (result) {
  //     // 중복인 경우
  //     $("#name").attr("style", "border-color:#e00751;");
  //     $("#nameGuidMsg").text("중복된 이름이 존재합니다.");
  //     $("#nameGuidMsg").attr("style", "display:block;");
  //   }
  // });
};
const checkEmail = () => {
  // null 여부 확인
  if (isNull($("#email"))) {
    $("#email").attr("style", "border-color:#e00751;");
    $("#emailGuidMsg").text("이메일을 입력해주세요.");
    $("#emailGuidMsg").attr("style", "display:block;");
  } else {
    $("#email").removeAttr("style");
    $("#emailGuidMsg").removeAttr("style");
  }
  // 구성 조건
  if ($("#email").val().match(email) == null) {
    $("#email").attr("style", "border-color:#e00751;");
    $("#emailGuidMsg").text("올바른 이메일 주소를 입력해주세요");
    $("#emailGuidMsg").attr("style", "display:block;");
  } else {
    $("#email").removeAttr("style");
    $("#emailGuidMsg").removeAttr("style");
  }
  // 중복 확인
  // joinService.checkDuplication($("#email").val(), (result) => {
  //   if (result) {
  //     // 중복인 경우
  //     $("#email").attr("style", "border-color:#e00751;");
  //     $("#emailGuidMsg").text("중복된 이메일이 존재합니다.");
  //     $("#emailGuidMsg").attr("style", "display:block;");
  //   }
  // });
};
const checkPw = () => {
  // null 여부 확인
  if (isNull($("#pw"))) {
    $("#pw").attr("style", "border-color:#e00751;");
    $("#pwGuidMsg").text("비밀번호를 입력해주세요.");
    $("#pwGuidMsg").attr("style", "display:block;");
  } else {
    $("#pw").removeAttr("style");
    $("#pwGuidMsg").removeAttr("style");
  }
  // 구성 조건
  if (pw.test($("#name").val())) {
    $("#pw").attr("style", "border-color:#e00751;");
    $("#pwGuidMsg").text(
      "비밀번호는 영문 대소문,숫자 조합으로 4~12자리를 사용해야 합니다."
    );
    $("#pwGuidMsg").attr("style", "display:block;");
  } else {
    $("#pw").removeAttr("style");
    $("#pwGuidMsg").removeAttr("style");
  }
};

$(document).ready(() => {
  // 이름
  $("#name").on("change", () => {
    checkName();
  });
  // 이메일
  $("#email").on("change", () => {
    checkEmail();
  });
  // 비밀번호
  $("#pw").on("change", () => {
    checkPw();
  });
});
$("#submit").on("click", (e) => {
  e.preventDefault();
  checkName();
  checkEmail();
  checkPw();
  $("form").submit();
});
