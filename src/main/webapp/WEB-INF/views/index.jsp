<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/5
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-6 column">
            <!--<form role="form">-->
            <div class="form-group">
                <label for="url">URL访问地址</label><input type="text" class="form-control" id="url"
                                                       value="http://www.baidu.com"/>
            </div>
            <div class="form-group">
                <label for="er">前缀</label><input type="text" class="form-control" id="er" value="<span"/>
            </div>
            <div class="form-group">
                <label for="pr">后缀</label><input type="text" class="form-control" id="pr" value="</span>"/>
            </div>
            <div class="form-group">
                <button type="button" class="btn btn-sm btn-success" onclick="getmessage()">测试</button>
            </div>
            <div class="form-group">
                <label for="time">时间</label><input type="text" class="form-control" id="time"/>
            </div>
            <div class="form-group">
                <button type="button" class="btn btn-sm btn-success" onclick="timeFunction()">定时执行</button>
                <button type="button" class="btn btn-sm btn-success" onclick="stopTimeFunction()">停止执行</button>
            </div>
            <!--</form>-->
        </div>
        <div class="col-md-6 column">
            <div class="panel panel-warning">
                <div class="panel-heading">
                    <h3 class="panel-title">
                        Panel title
                    </h3>
                </div>
                <div class="panel-body" id="pds">
                    <p></p>
                </div>
                <div class="panel-footer">
                    Panel footer
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="<%=request.getContextPath()%>/static/js/message.js"></script>
</body>
</html>
