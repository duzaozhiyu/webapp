$(function(){
    $(".center_form_res form p a").click(logAction);
    $(".center_form_log form p a").click(logAction);
    $(".btn_login").click(isLogin);
    $(".btn_register").click(isRegister);
})

function logAction(){
    $(".center_form_log").slideToggle();
    $(".center_form_res").slideToggle();
}

// 登录提交
function isLogin()
{
   $(".center_form_log form").submit();
}
// 注册提交
function isRegister(){

}


function alert(){
    alert("hi barry");
}