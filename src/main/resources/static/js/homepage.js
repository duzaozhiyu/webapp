$(function () {
    $(".action li").mouseleave(function () {
        toggleBackgroundColor(this);
        console.log("out");
    });
    $(".action li").mouseenter(function () {
        toggleBackgroundColor(this);
        console.log("over");
    });

    $("#mySidebar").hover(toggleSlideBar);


    // // 头像出发的动作
    // $(".dropdown").hover(downSildeListAnimate,backSildeListAnimate);
    // // 下拉的列表触发的动作
    // $(".top-drop-menu").hover(visSlideList,backSildeListAnimate);
})

// 为true 时 侧边栏处于 缩小 状态 变为 扩展状态
let toggleFlag = true;

let toggleBColor = true;

let out = true;

function toggleSlideBar() {
    if (toggleFlag) {
        $(".sidebar").width(200);
        $("#main").css("marginLeft", "200px");
        console.log("toggleFlag:" + toggleFlag);
        toggleFlag = false;
        console.log("open sideBar");
    } else {
        $(".sidebar").width(80);
        $("#main").css("marginLeft", "80px");
        toggleFlag = true;
        console.log("close sideBar");
    }
}

// 改变右侧栏的颜色
function toggleBackgroundColor(content) {
    if (toggleBColor) {
        $(content).css("background-color", "#64A6BD")
        // content.style.backgroundColor="#64A6BD";
        toggleBColor = false;
    } else {
        //content.style.backgroundColor="#cc2936";
        $(content).css("background-color", "#cc2936")
        toggleBColor = true;
    }

}

//右侧下拉栏的动画效果
function downSildeListAnimate() {
    $(".top-drop-menu").css("visibility", "visible");
    $(".top-drop-menu").animate({
        top: "75px",
        opacity: 1,
    }, 10);

    console.log("animate down");
}

//恢复
function backSildeListAnimate() {

    $(".top-drop-menu").animate({
        top: "100px",
        opacity: 0,
        visibility: "hidden"
    }, 10);
    $(".top-drop-menu").css("visibility", "hidden");
    console.log("animate back");

}

function visSlideList() {
    $(".top-drop-menu").css({
        top: "85px",
        opacity: 1
    });
    console.log("visslideList");

}

//左侧栏划入
function sidebarIn() {
    console.log("in");
}

function sidebarOut() {
    console.log("out");
    console.log("ooo");
}


var btn = document.getElementById('user-img');
var box = document.getElementById('dropmenu');
var timer = null;
box.onmouseover = btn.onmouseover = function () {
    if (timer) clearTimeout(timer)
    box.style.display = 'block';
    console.log("mouserover");
}
box.onmouseout = btn.onmouseout = function () {
    timer = setTimeout(function () {
        box.style.display = 'none';
    }, 100);
    console.log("mouserout");
}



