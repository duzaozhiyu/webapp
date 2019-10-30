let myChart;
let myChart2;

$(function () {

    initView();
    window.onresize = function () {
        if (myChart) {
            myChart.resize();
        }
        if(myChart2)
        {
            myChart2.resize();
        }
    }
})

function initView() {
    initChart1();
    initChart2();
}

function initChart1() {
    myChart = echarts.init(document.getElementById('charts1'));
    // 指定图表的配置项和数据
    let option = {
        title: {
            text: '雨量流量关系图',
            x: 'center',
        },
        grid: {
            show: true,
        },
        xAxis: {
            data: ["衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"],
            splitLine: {show: true},
            axisTick: false,  //是否显示刻度
        },
        yAxis: {
            splitLine: {show: true},
            axisTick: false,
        },
        series: [{
            name: '销量',
            type: 'bar',
            data: [5, 20, 36, 10, 10, 20]
        }]
    };
    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
}

function initChart2() {
    myChart2 = echarts.init(document.getElementById('charts2'));
    // 指定图表的配置项和数据
    let option2 = {
        title: {
            text: '雨量流量关系图',
            x: 'center',
        },
        grid: {
            show: true,
        },
        xAxis: {
            data: ["衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子"],
            splitLine: {show: true},
            axisTick: false,  //是否显示刻度
        },
        yAxis: {
            splitLine: {show: true},
            axisTick: false,
        },
        series: [{
            name: '销量',
            type: 'bar',
            data: [5, 20, 36, 10, 10, 20]
        }]
    };

    // 使用刚指定的配置项和数据显示图表。
    myChart2.setOption(option2);
}