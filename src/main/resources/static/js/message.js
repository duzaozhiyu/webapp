function getmessage(){
    var inputUrl=$("#url").val();
    var er=$("#er").val();
    var pr=$("#pr").val();
    $.post("/getMessage",{
        url:inputUrl,
        cer:er,
        cpr:pr
    },function (content) {
       var divP=document.getElementById("pds");
       var pd=document.createElement("p");
       pd.innerText=content.message;
       divP.appendChild(pd);
    })
}

var timeQ;
//定时器功能
function timeFunction()
{
    var time=$("#time").val();
    timeQ=window.setInterval(getmessage,time);
}
//停止定时器
function stopTimeFunction()
{
    window.clearInterval(timeQ);
}