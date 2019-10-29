<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3.org/TR/html4/frameset.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %><html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
	<link href='${pageContext.request.contextPath}/pages/css/main.css' rel='stylesheet' type='text/css'></link>
	<title>电信运营计费管理系统-帐务修改输入</title>
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
<!--功能导航开始-->
	

<!-- 标准标记库 -->

<table width='778' border='0' cellspacing='0' cellpadding='0'>
	<tr>
		<td width='13' height='13'><img src="${pageContext.request.contextPath}/pages/images/sy_10.jpg" height="61" width="13"></td>
		<td width='752' background='${pageContext.request.contextPath}/pages/images/sy_12.jpg'>
		<table width='100%' border='0' cellspacing='0' cellpadding='0'>
			<tr>
				<td align='left'>
				<!-- 这里的工具条上的菜单是由权限决定的,在登录的时候存放在session的modules中 -->
					<a href="${pageContext.request.contextPath}/pages/main.jsp" class="cl">首页</a><span class="STYLE4">|</span>

					<c:forEach items="${moduleList}" var="module">
						<a href="${pageContext.request.contextPath}/${module.url}" class="cl">${module.name}</a><span class="STYLE4">|</span>
					</c:forEach>

					<a href="${pageContext.request.contextPath}/exit" class="cl">退出</a><span class="STYLE4">|</span>
  				</td>
      		</tr>
    	</table>
    	</td>
    	<td width='13'><img src="${pageContext.request.contextPath}/pages/images/sy_13.jpg" height="61" width="14"></td>
  	</tr>
</table>
<!--功能导航开结束-->
</center>
<!--正文区开始[包含左边的功能操作菜单，与中间的操作区域]-->
<center>
<table width='778' height='370' border='1'>
	<tr>
	<!--左边列[功能操作菜单]开始 -->
	<td valign='top' bgcolor='#f8f8f8'>
		

<!-- 标准标记库 -->

<!--菜单标题栏开始-->
	<table width='100%' height='31' border='0' cellspacing='0' cellpadding='0' background='${pageContext.request.contextPath}/pages/images/index_26.jpg'>
		<tr>
		<td width='18%'>&nbsp;</td>
		<td width='47%' valign='middle' background='${pageContext.request.contextPath}/pages/images/ctitle_bak_fcenter.jpg'><span class="channel_title">用户管理<!-- 模块名称 -->></span></td>
		<td width='9%' align='left' valign='middle' background='${pageContext.request.contextPath}/pages/images/ctitle_bak_fcenter.jpg'><img src="${pageContext.request.contextPath}/pages/images/channel_dh_2.jpg" height="12" width="18"></td>
		<td width='26%' align='right' valign='middle' background='${pageContext.request.contextPath}/pages/images/ctitle_bak_center.jpg'><img src="${pageContext.request.contextPath}/pages/images/ctitle_bak_right.jpg" height="31" width="10"></td>
		</tr>
	</table>
	<!--菜单标题栏结束-->
	<!--菜单项开始-->
	<table width='100%' border='0' cellspacing='0' cellpadding='0'>
  		<tr>
		<td style='border-bottom: 1px solid #d5d5d5;border-left: 1px solid #d5d5d5; border-right: 1px solid #d5d5d5;'>
		<table width='191' height='31' border='0' cellpadding='0' cellspacing='0' background='${pageContext.request.contextPath}/pages/images/subchannel_bak.jpg'>
        	<tr>
			<td width='36' height='31' align='right' valign='middle'><img src="${pageContext.request.contextPath}/pages/images/subchannel_doc.jpg" height="9" width="6">&nbsp;</td>
          	<td align='left' valign='middle'>
          		<table border='0' cellpadding='0' cellspacing='0'>
  					<tr>
					<td height='31'><a href='index.jsp'>首页</a></td>
					</tr>
				</table>
			</td>
          	</tr>
      	</table>
      	<!-- 循环显示操作菜单 -->

			<c:forEach items="${moduleList}" var="module">
				<c:if test="${module.name=='用户管理'}">
					<c:forEach items="${module.rightList}" var="right">
						<table width='191' height='31' border='0' cellpadding='0' cellspacing='0' background='${pageContext.request.contextPath}/pages/images/subchannel_bak.jpg'>
							<tr>
								<td width='36' height='31' align='right' valign='middle'><img src="${pageContext.request.contextPath}/pages/images/subchannel_doc.jpg" height="9" width="6">&nbsp;</td>
								<td align='left' valign='middle'>
									<table border='0' cellpadding='0' cellspacing='0'>
										<tr>
											<td height='31'><a href='${pageContext.request.contextPath}/${right.url}?pageNo=1'>${right.name}</a></td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</c:forEach>
				</c:if>
			</c:forEach>
      	
		<table cellpadding='0' cellspacing='0' width='100%'>
        	<tr><td width='100%' height='3'></td></tr>
        </table>
		</td>
		</tr>
	</table>
	<!--菜单项结束-->
	</td>
	<!--左边列[功能操作菜单]结束 -->

	<!--内容区开始-->
    <td width='575' align='center' valign='top'>
    	

<!-- 标准标记库 -->


<table width='100%' height='10%' border='0' cellspacing='0' cellpadding='0'>
	<tr>
		<td width='40' background='${pageContext.request.contextPath}/pages/images/index_26.jpg'>&nbsp;</td>
		<!--内容区导航开始-->
		<td align='left' valign='middle' background='${pageContext.request.contextPath}/pages/images/ctitle_bak_center.jpg'>
		<table border='0' cellspacing='0' cellpadding='0'>
			<tr>
				
				<td height='31' background='${pageContext.request.contextPath}/pages/images/ctitle_bak_fcenter.jpg'>
				<a href='${pageContext.request.contextPath}/pages/main.jsp' class=channel_title>首页</a>
				<img src="${pageContext.request.contextPath}/pages/images/sy_2_18.jpg" border="0">
				<a href='index.jsp' class=channel_title>用户管理首页</a>
				<img src="${pageContext.request.contextPath}/pages/images/sy_2_18.jpg" border="0">
				<a href='${pageContext.request.contextPath}/pages/user/acctupdate.jsp' class=channel_title>帐务修改输入</a>
				</td>
			</tr>
		</table>
		</td>
		<!--内容区导航结束-->
		<td align='left' valign='middle' background='${pageContext.request.contextPath}/pages/images/ctitle_bak_center.jpg'>&nbsp;</td>
		<td width='13' align='right' valign='middle' background='${pageContext.request.contextPath}/pages/images/ctitle_bak_center.jpg'>
		<img src="${pageContext.request.contextPath}/pages/images/ctitle_bak_right.jpg" height="31" width="10">
		</td>
	</tr>
</table>

<table width='100%' border='1' cellspacing='0' cellpadding='0'>
	<tr width="100%" height="300px">
		<!-- 显示查询UI -->
		<td align="center" valign="top">		 
		
		<form name="accform" method="post" action="../user/acctupdate.jsp">
			<table border="0"  cellspacing='0' cellpadding='0' width="50%" height="80%">
			<tr>
				<td align="right" valign="top">用户ID：</td>
				<td align="left" valign="top"><input type="text" name="id" value="1" readonly="readonly" style="WIDTH:170px"></td>
			</tr>
			<tr>
				<td align="right" valign="top">用户姓名：</td>
				<td align="left" valign="top"><input type="text" name="name" value="openlab" style="WIDTH:170px"></td>
			</tr>
			<tr>
				<td align="right" valign="top">登录名：</td>
				<td align="left" valign="top"><input type="text" name="loginname" value="openlab" style="WIDTH:170px"></td>
			</tr>
			<tr>
				<td align="right" valign="top">登录口令：</td>				
				<td align="left"  valign="top"><input type="text" name="loginpassword" value="490651" style="WIDTH:170px"></td>
				
			</tr>
			<tr>
				<td align="right" valign="top">状态：</td>
				<td align="left" valign="top">
				<input type="radio" name="status" value="0" checked="checked">开通
				<input type="radio" name="status" value="1">暂停
				</td>	
			</tr>
			<tr>
				<td align="right" valign="top">支付方式：</td>
				<td align="left" valign="top"><input type="text" name="paymenttpye" value="现金" style="width:170px;"></td>	
			</tr>
			<tr>
				<td align="right" valign="top">电话：</td>
				<td align="left" valign="top"><input type="text" name="phone" value="" style="width:170px;"></td>	
			</tr>
			<tr>
				<td align="right" valign="top">电子邮件：</td>
				<td align="left" valign="top"><input type="text" name="email" value="" style="width:170px;"></td>	
			</tr>
			<tr>
				<td align="right" valign="top">性别：</td>
				<td align="left" valign="top">
					<input type="radio" name="sex" value="0" checked="checked">女
					<input type="radio" name="sex" value="1">男
					
				</td>	
			</tr>
			<tr>
				<td align="right" valign="top">民族：</td>
				<td align="left" valign="top"><input type="text" name="nationality" value="" style="width:170px;"></td>	
			</tr>
			<tr>
				<td align="right" valign="top">职业：</td>
				<td align="left" valign="top"><input type="text" name="career" value="" style="width:170px;"></td>	
			</tr>
			<tr>
				<td align="right" valign="top">就职公司：</td>
				<td align="left" valign="top"><input type="text" name="company" value="" style="width:170px;"></td>	
			</tr>
			<tr>
				<td align="right" valign="top">邮政编码：</td>
				<td align="left" valign="top"><input type="text" name="zip" value="" style="width:170px;"></td>	
			</tr>
			<tr>
				<td  align="center" colspan="2"><input type="submit" value="修改">&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="取消"> </td>
				<td>
			</tr>
			</table>
		</form>
			
		</td>
	</tr>

	<tr width="100%"  height="20px" style="background-color:#c0c0c0;">
		<!-- 错误提示行 -->
			<td align="left"><font color="blue">提示:</font></td>
	</tr>
</table>

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
</BODY>
</html>