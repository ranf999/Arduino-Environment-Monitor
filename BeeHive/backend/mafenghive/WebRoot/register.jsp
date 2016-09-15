<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta charset="utf-8">
<title>login</title>
    <meta charset="UTF-8">
    <title>注册页面</title>
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
    <div class="main-box regbox">
        <div class="logo">
            <img src="./pic/logo.png" alt="">
        </div>
        <form action="SignupAction" method="post" id="regForm">
            <div class="list-items-box" style="border-top: 1px solid #e5e5e5">
                <ul>
                    <li><label>手机号</label><input type="text" name="phone" class="right-input" placeholder="请输入您的手机号" ></li>
                    <li><label>昵称</label><input type="text" name="nickname" class="right-input" placeholder="请输入昵称" /></li>
                    <li><label>密码</label><input type="password" class="right-input" placeholder="请输入密码" name="password"></li>
                    <li><label>确认密码</label><input type="password" class="right-input" placeholder="请输入密码" name="retypepassword"></li>
                    <li><label>所在地</label><input type="text" name="city" class="right-input" placeholder="请输入所在地"required /></li>
                </ul>
            </div> 
            <div class="btn-mg" id="register">
                <input type="submit" class="btn-box btn-full" value="提交"/>
            </div>
        </form>    
    </div>
</body>
</html>
