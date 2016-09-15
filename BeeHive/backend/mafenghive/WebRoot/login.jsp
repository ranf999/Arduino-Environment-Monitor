<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta charset="utf-8">
<title>login</title>
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <link rel="stylesheet" href="./css/reset.css">
    <link rel="stylesheet" href="./css/life.css">
    <script src="./js/jquery.js"></script>
    <script src="./js/screem.js"></script>
</head>

<body style="height: 100%;">
    <div class="main-box loginbox">
        <div class="logo">
            <img src="./pic/logo.png" alt="">
        </div>
       <form action="LoginAction" name="LoginForm" method="post">
            <div class="list-items-box" style="border-top: 1px solid #e5e5e5">
                <ul>
                    <li><label>手机号</label><input pattern="[0-9]*" type="text" name="phone" class="right-input"
                   placeholder="请输入您的手机号" required /></li>
                    <li><label>密码</label><input type="password" name="password"  class="right-input"
             placeholder="请输入您的密码" required /></li>
                </ul>
            </div> 
            <div class="btn-mg" id="login">
                 <input type="submit" value="登录"  class="btn-box btn-full"/>
            </div>
            <div class="btn-mg" id="register">
                <div class="btn-box btn-full btn-green">
                    <a href="register.jsp">注册</a>
                </div>
            </div>
        </form>    
    </div>
</body>
</html>
