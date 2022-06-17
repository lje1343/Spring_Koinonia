///////////////////////////////////////////////////////////////////////////////////////
// 동적 페이지 구현

// select
const selectOpenClose = (li) => {
  let selectBtn = document.querySelector(li + " button.select");
  let option = document.querySelector(li + " .option");
  if (!selectBtn.classList.contains("open")) {
    selectBtn.classList.add("open");
    option.classList.add("openOption");
  } else {
    selectBtn.classList.remove("open");
    option.classList.remove("openOption");
  }
};
// 대상 이외 부분 클릭시
function clickBodyEventNationality(event) {
  if (document.querySelector("#selectBtn").classList.contains("open")) {
    var target = event.target;
    if (
      !document.querySelector("#selectBtn").contains(target) &&
      !document.querySelector("#option").contains(target)
    ) {
      document.querySelector("#selectBtn").classList.remove("open");
      document.querySelector("#option").classList.remove("openOption");
    }
  }
}
$(document).on("click", ".nationalityArea button.select", function () {
  selectOpenClose(".nationalityArea");
});
window.addEventListener("click", clickBodyEventNationality);
$(".nationalityArea .optionList").click((e) => {
  $("#select").val(e.currentTarget.innerText).prop("selected", true);
  $("#selectBtn").text(e.currentTarget.innerText);
  document.querySelector("#selectBtn").classList.remove("open");
  document.querySelector("#option").classList.remove("openOption");
});

// 썸네일
$("#thum").on("change", function () {
  $("#viewInput").val($("#thum").val());
});
///////////////////////////////////////////////////////////////////////////////////////
// ajax

// 썸네일 유효성 검사
let regex = new RegExp("(.*?)\.(jpg|png|gif)");

function checkExtension(fileName, fileSize){
  if(!regex.test(fileName)){
    alert("업로드 할 수 없는 파일의 형식입니다.");
    return false;
  }

  if(fileSize >= 5242880){
    alert("파일 사이즈 초과");
    return false;
  }

  return true;
}

// 썸네일 업로드
$("#thum").on("change", function(e){
  let formData = new FormData();
  let inputFile = $("input[name='thum']");
  let files = inputFile[0].files;
  for(let i=0; i<files.length; i++){
    if(!checkExtension(files[i].name, files[i].size)){
      $("#thum").val("");
      $("#viewInput").val("");
      return;
    }
    formData.append("uploadFile", files[i]);
  }
  //
  // $.ajax({
  //   url: "uploadAjaxAction",
  //   type: "post",
  //   data: formData,
  //   contentType: false,
  //   processData: false,
  //   success: function(files){
  //     // showUploadResult(files);
  //   }
  // });
});

///////////////////////////////////////////////////////////////////////////////////////
// 썸머노트

// summernote create
$("#summernote").summernote({
  tabsize: 2,
  height: 450, // 에디터 높이
  minHeight: 450, // 최소 높이
  maxHeight: 450, // 최대 높이
  focus: false, // 에디터 로딩후 포커스를 맞출지 여부
  lang: "ko-KR", // 한글 설정
  placeholder: "다이어리를 작성해주세요.", //placeholder 설정
  callbacks: {
    onImageUpload: function (files) { //이미지 업로드 처리
      RealTimeImageUpdate(files, this); // this = $("#summernote")
    },
    // onChange:function(contents, $editable){ //텍스트 글자수 및 이미지등록개수
    //   setContentsLength(contents, 0);
    // }
  },
});

$(document).on('click', '#uploadBtn', function () {
  saveContent();
});

const saveContent = () => {
  var summernoteContent = $('#summernote').summernote('code'); // 썸머노트 작성내용(html)
  console.log("summernoteContent : " + summernoteContent);
}

//글자수 체크
//태그와 줄바꿈, 공백을 제거하고 텍스트 글자수만 가져옵니다.
// function setContentsLength(str, index) {
//   var status = false;
//   var textCnt = 0; //총 글자수
//   var maxCnt = 100; //최대 글자수
//   var editorText = f_SkipTags_html(str); //에디터에서 태그를 삭제하고 내용만 가져오기
//   editorText = editorText.replace(/\s/gi,""); //줄바꿈 제거
//   editorText = editorText.replace(/&nbsp;/gi, ""); //공백제거
//
//   textCnt = editorText.length;
//   if(maxCnt > 0) {
//     if(textCnt > maxCnt) {
//       status = true;
//     }
//   }
//
//   if(status) {
//     var msg = "등록오류 : 글자수는 최대 "+maxCnt+"까지 등록이 가능합니다. / 현재 글자수 : "+textCnt+"자";
//     console.log(msg);
//   }
// }

//이미지 등록처리
function RealTimeImageUpdate(files, editor) {
  var status = false;
  var reg = /(.*?)\.(gif|jpg|png|jepg)$/; //허용할 확장자

  var formData = new FormData();
  var fileArr = Array.prototype.slice.call(files);
  var filename = "";
  var fileCnt = 0;
  fileArr.forEach(function(f){
    filename = f.name;
    if(filename.match(reg)) {
      formData.append('file[]', f);
      fileCnt++;
    }
  });
  formData.append('tempFolder', $('#tempFolder').val());

  if(fileCnt <= 0) {
    alert("파일은 gif, png, jpg 파일만 등록해 주세요.");
    return;
  } else {
    $.ajax({
      url : "이미지 업로드 처리할 주소",
      data:formData,
      cache:false,
      contentType:false,
      processData:false,
      enctype:'multipart/formDataData',
      type:'POST',
      success:function(result) {
        var data = JSON.parse(result);
        for(x = 0; x < data.length; x++) {
          var img = $('<img>').attr({src:data[x]});
          $(editor).summernote('pasteHTML', '<img src="'+data[x]+'" />');
        }
      }
    });
  }
}

//에디터 내용 텍스트 제거
function f_SkipTags_html(input, allowed) {
  // 허용할 태그는 다음과 같이 소문자로 넘겨받습니다. (<a><b><c>)
  allowed = (((allowed || "") + "").toLowerCase().match(/<[a-z][a-z0-9]*>/g) || []).join('');
  var tags = /<\/?([a-z][a-z0-9]*)\b[^>]*>/gi,
      commentsAndPhpTags = /<!--[\s\S]*?-->|<\?(?:php)?[\s\S]*?\?>/gi;
  return input.replace(commentsAndPhpTags, '').replace(tags, function ($0, $1) {
    return allowed.indexOf('<' + $1.toLowerCase() + '>') > -1 ? $0 : '';
  });
}




