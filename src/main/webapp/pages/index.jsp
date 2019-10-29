<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
	<link href='${pageContext.request.contextPath}/pages/css/main.css' rel='stylesheet' type='text/css'> </link>
	<link href='${pageContext.request.contextPath}/pages/css/edit.css' rel='stylesheet' type='text/css'> </link>
	<link href='${pageContext.request.contextPath}/pages/css/style.css' rel='stylesheet' type='text/css'> </link>
	<title>电信运营计费管理系统-登录</title>
	<style type="text/css">
	<!--
	body {
		margin-left: 0px;
		margin-top: 0px;
	}
	.STYLE5{
		font-size: 9px;
	}
	P{
		LINE-HEIGHT: 120%; font-size: 12px; font-style: normal;
	}
	.STYLE6{
		font-size: 13px;
		font-weight: bold;
	}
	.STYLE7{
		color: #FF8605;
	}
	P{
		LINE-HEIGHT: 150%; font-size: 14px; text-indent: 20pt;font-style: normal;
	}
	LI{
		FONT-SIZE: 12px;
	}
	-->
	</style>
</head>
<body>
<center>
<!--logo头开始-->
	


<table width='778' height='74' border='0' cellpadding='0' cellspacing='0'>
	<tr>
	<td>
	<table height='100%' border='0' cellpadding='0' cellspacing='0'>
	<tr>
		<td width='168' height='100%'><a href="http://zb.hfbdqn-edu.com" target=_blank><img src="${pageContext.request.contextPath}/pages/images/logo.jpg" height="39" width="111" border="0"></a></td>
		<td width='13'><img src="${pageContext.request.contextPath}/pages/images/sy_03.jpg" height="67" width="13"></td>
		<td width='136'><img src="${pageContext.request.contextPath}/pages/images/sy_04.jpg" height="37" width="348"></td>
		<td width='276'>&nbsp;</td>
		<td width='175' valign='bottom'>&nbsp;</td>
	</tr>
	</table></td>
  </tr>
</table>
<!--logo头结束-->
	<p>&nbsp;</p>
</center>
<!--正文区开始[包含左边的功能操作菜单，与中间的操作区域]-->
<center>
<table width='778' height='370' border='0'>
	<tr>
		<td>&nbsp;</td>
	</tr>

	<tr>
	<!--左边列[功能操作菜单]结束 -->
	<!--内容区开始-->
    <td width='100%' align='center' valign='top'>
    	

<center>
<form name="login" method="post" action="${pageContext.request.contextPath}/login">
<table class="font" cellspacing="0" cellpadding="0" align="center" border="0" background="${pageContext.request.contextPath}/pages/images/index_r3_c1new.gif" width="196" height="215">
<tbody> 
	<tr><td>&nbsp;</td></tr>
	<tr><td>&nbsp;</td></tr>
	<tr height="20"> 
		<td><span id=codes>帐&nbsp;&nbsp;&nbsp;&nbsp;号</span>：</td>
		<td>
			<input type="text" name="loginname" value="" style="WIDTH:100px"><br/>
		</td>
	</tr>
	<tr height="20"> 
		<td>密&nbsp;&nbsp;&nbsp;&nbsp;码： </td>
		<td>
			<input type="text" name="loginpassword" maxlength="20" value="" style="WIDTH: 100px">
		</td>
	</tr>
	<tr height="20"> 
		<td>用&nbsp;&nbsp;&nbsp;&nbsp;户： </td>
		<td>
			<select name="usertype">
				<option value="1" >用户</option>
    			<option value="2" >管理员</option>
		    </select>
		</td>
	</tr>

	<tr height="20"> 
		<td>验 证 码：</td>
		<td> 
			<input type="text" name="code" maxlength="5" value="" style="WIDTH: 50px">
	   		<img src="${pageContext.request.contextPath}/generateCode" height="18" width="43" border="0" onclick="this.src=this.src +'?'+new Date();">
	   	</td>
	</tr>
	<tr height="20"> 
		<td colspan="2">
		${msg}
		</td>
	</tr>
	<tr> 
		<td colspan="2">
				<input type="submit" value="登录">
				<input type="reset" value="取消">
		</td>
	</tr>
</tbody>
</table>


 
</form>    	
</center>
	</td>
	<!--内容区结束-->
	</tr>
</table>
</center>
<!--正文区开始[包含左边的功能操作菜单，与中间的操作区域]结束-->


<!--页面尾巴开始-->
	

<center>
<table width='778' height='70' border='0' cellpadding='0' cellspacing='0'>
	<tr>
		<td height='86' align='center'>
			<table width='80%' border='0' cellspacing='2' cellpadding='0'>
				<tr>
					<td height='39' align='center'>
					<div id="copyright" >
					<span class="L12">
					首页	- 在线帮助 - 网站介绍 - 客户支持 - 意见反馈 - 网站导航 -
					<a href="http://zb.hfbdqn-edu.com" class="bottom_link" target=_blank>关于我们</a>
					</span>
					<br/>
          			</div>
          			</td>
        		</tr>
				<tr>
					<td height='15' align='center'>
						
						<span style="PADDING-RIGHT: 3px; PADDING-LEFT: 3px; FONT-SIZE: 12px; PADDING-BOTTOM: 3px; COLOR: #999; PADDING-TOP: 3px">
						[源自北美的技术，最优秀的师资，最真实的企业环境，最适用的实战项目]
						</span>
						
					</td>
				</tr>
        		<tr>
					<td height='15' align='center'>
						<span style="PADDING-RIGHT: 3px; PADDING-LEFT: 3px; FONT-SIZE: 12px; PADDING-BOTTOM: 3px; COLOR: #999; PADDING-TOP: 3px">
						版权所有(C)中博IT培训集团公司
						</span>
					</td>
				</tr>
			</table>
		</td>
	</tr>
  </table>
</center>
<!--页面尾巴结束-->

</body>
</html>