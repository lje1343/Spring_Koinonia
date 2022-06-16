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
  if(regex.test(fileName)){
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
("#uploadBtn").on("click", function(e){
  let formData = new FormData();
  let inputFile = $("input[name='uploadFile']");
  // console.log(inputFile);
  let files = inputFile[0].files;
  // console.log(files);
  for(let i=0; i<files.length; i++){
    if(!checkExtension(files[i].name, files[i].size)){ return; }
    formData.append("uploadFile", files[i]);
  }

  $.ajax({
    url: "uploadAjaxAction",
    type: "post",
    data: formData,
    contentType: false,
    processData: false,
    success: function(files){
      showUploadResult(files);
    }
  });

});
