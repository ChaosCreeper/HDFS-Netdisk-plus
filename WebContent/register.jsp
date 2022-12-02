<%--
  Created by IntelliJ IDEA.
  User: observer0112
  Date: 2022/12/2
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="head.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<body style="text-align:center;margin-bottom:100px;">
<div class="navbar" >
    <div class="navbar-inner">
        <a class="brand" href="#" style="margin-left:100px;">HDFS网盘</a>
    </div>
</div>
<div  style="text-align:left;margin:0px auto;margin-top:50px; width:1200px;height:450px;">
    <div style="float:left;width:800px; height:100%; background:#00CC02">
        <img width="800px" src="assets/img/hadoop-bg2.jpg">
    </div>
    <div style="float:left;width:400px; height:100%; background:#00CED1; font-family:黑体;">
        <div style="padding-top:80px; margin-left:60px; "><p style="font-size: 4em">用户注册</p></div>
        <fieldset>
            <form  action="RegisterServlet" method="post" class="form-horizontal" style="margin-top:80px;margin-left:100px;">
                用户&nbsp;&nbsp;<input type="text" id="inputUsername" name="username" >
                <br><br>
                密码&nbsp;&nbsp;<input type="password" id="inputPassword"  name="password">
                <br><br>
                邮箱&nbsp;&nbsp;<input type="email" id="inputEmail"  name="eamil">
                <button style="margin-left:30px; " type="submit" class="btn">注册</button>&nbsp;&nbsp;&nbsp;&nbsp;
                <button type="button" class="btn" onclick="forRegister">登录</button>
            </form>
        </fieldset>
    </div>
</div>
<script type="text/javascript">
    function forRegister() {
        window.location = "login.jsp";
    }
</script>

</body>
