<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: krumo
  Date: 2016/2/18
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="beehive.bean.User"%>
<%@ page import="beehive.bean.Switch"%>

<%  
Switch status = null;
status = (Switch) request.getSession().getAttribute("status");
if(status == null)
	out.println("Report get fail -_-");

%>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="refresh" content="20">
<title>环境监测控制</title>
<link href="./css/style.css" rel="stylesheet" type="text/css">
<link href="./css/reset.css" rel="stylesheet" type="text/css">
  <link rel="stylesheet" href="css/normalize.css">

 <link rel="stylesheet" href="css/style1.css" media="screen" type="text/css" />
<script src="./js/screem.js"></script>
<script src="./js/jquery.min.js"></script>
</head>

<body>
<div class="topdiv">
<p>环境监测系统</p>
</div>

<div class="middiv2" >
	
	<div >
		<table class="switchtable" >
        <tr style="background:#FFEBCA">
        	<td>手动开关</td>
            <td id="statusvalue" style="color:#FFEBCA;"><%out.print(status.getStatus()); %></td>
            <td>  <div class="switch">
  <input type="checkbox" id="control0" class="control">
  <label for="control0" class="checkbox"></label>
</div></td>
        </tr>
        <tr style="background:#E4E4E4">
        	<td>开关1</td>
            <td id="status1"></td>
            <td>  <div class="switch">
  <input type="checkbox" id="control" class="control">
  <label for="control" class="checkbox"></label>
</div></td>
        </tr>
        <tr>
        	<td>开关2</td>
            <td>——</td>
            <td>  <div class="switch">
  <input type="checkbox" id="control2" class="control">
  <label for="control2" class="checkbox"></label>
</div></td>

        </tr>
        <tr style="background:#E4E4E4">
        	<td>开关3</td>
            <td>——</td>
            <td>  <div class="switch">
  <input type="checkbox" id="control3" class="control">
  <label for="control3" class="checkbox"></label>
</div></td>
        </tr>
        <tr>
        	<td>开关4</td>
            <td>——</td>
            <td>  <div class="switch">
  <input type="checkbox" id="control4" class="control">
  <label for="contro4l" class="checkbox"></label>
</div></td>
        </tr>
                <tr style="background:#E4E4E4">
        	<td>开关5</td>
            <td>——</td>
            <td>  <div class="switch">
  <input type="checkbox" id="control5" class="control">
  <label for="control5" class="checkbox"></label>
</div></td>
        </tr>
        </table>
    </div>
</div>

<div class="bottomdiv">
	<div class="bottomicon" id="bottom_icon1" >		
    <a href="DisplayAction"><img src="./pic/bottom_icon1.png"></a>
    </div>
	<div class="bottomicon" id="bottom_icon2">
    <a href="./history_page.jsp"><img src="./pic/bottom_icon2.png"></a>
    </div>
	<div class="bottomicon" id="bottom_icon3">
    <a href="StatusAction"><img src="./pic/bottom_icon3_touch.png"></a>
    </div>
</div>

<script type="text/javascript">   
  
   $(document).ready(function() {  
      
    var value = $("#statusvalue").text();
    if(value==0)
	{
		$("#status1").text("已关闭");
	}
	if(value==1)
	{
		$("#status1").text("已打开");
	}
	
});  
</script>

</body>
</html>
