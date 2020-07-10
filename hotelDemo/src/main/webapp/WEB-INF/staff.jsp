<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";;
	String basePathManager = basePath + "manager/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta content="" name="description" />
<meta content="webthemez" name="author" />
<title>员工管理</title>
<jsp:include page="/part/manager.css.jsp"></jsp:include>
</head>
<body>
	<div id="wrapper">
		<!--头部：页面标题栏-->
		<jsp:include page="/part/manager.header.jsp"></jsp:include>
		<!--导航栏：页面菜单栏-->
		<jsp:include page="/part/manager.menu.jsp"></jsp:include>
		<!--表格-->
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<!-- start dataTables -->
						<!-- 表格格式：面板中嵌套表格 -->
						<div class="panel panel-default">
							<!-- 面板头放：页面标题，刷新按钮，添加按钮 -->
							<div class="panel-heading">
								<font size="4">员工管理</font> <a
									href="<%=basePath%>CustomerServlet?op=show"> <span
									class="glyphicon glyphicon-repeat"></span>
								</a>
								<span style="float: right">
									<button type="button" class="btn btn-default btn-sm"
										data-toggle="modal" data-target="#myModal">
										<span class="glyphicon glyphicon-plane"></span> 新增员工
									</button>
								</span>
							</div>
							<!-- 面板体放：表格内容，按照dataTable格式来构造-->
							<div class="panel-body">
								<div class="table-responsive">
									<table class="table table-striped table-bordered table-hover"
										id="dataTables-example1">
										<thead>
											<tr>
												<th>员工编号</th>
												<th>员工姓名</th>
												<th>员工年龄</th>
												<th>员工类型</th>
												<th>员工电话</th>
												<th>员工身份证号</th>
												<th>员工住址</th>
												<th>员工状态</th>
											</tr>
										</thead>
										<tbody>
											<c:if test="${not empty list } ">
												<c:forEach var="staff" items="${list }">
													<tr>
														<td>${staff.staffId }</td>
														<td>${staff.staffName }</td>
														<td>${staff.staffAge }</td>
														<td>${staff.staffType }</td>
														<td>${staff.staffTele }</td>
														<td>${staff.staffCardNumber }</td>
														<td>${staff.staffAdress }</td>
														<td>${staff.staffStatus }</td>
														<td><a id="edit" href="#" data-toggle="modal" data-target="#myModal" onclick="editInfo(this,1)">
															<span class="glyphicon glyphicon-edit"></span>
														</a></td>
														<td><a href="javascript:doDelete(${staff.staffId })" style="color:red">
															<span class="glyphicon glyphicon-remove"></span>
														</a></td>
													</tr>
												</c:forEach>
											</c:if>
										</tbody>
									</table>
								</div>
							</div>
						</div>
						<!--End dataTables -->
						<!-- 按钮触发模态框 -->
						<!-- 模态框（Modal） myModal-->
						<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
							aria-labelledby="myModalLabel" aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-hidden="true">×</button>
										<!-- 表单嵌套表格：规范表单格式 -->
										<form action="" method="post" role="form" id="editForm">
											<input type="hidden" id="staffId" name="staffId" class="form-control">
											<div class="form-group">
												<table class="table" style="font: '黑体';">
													<thead>
														<tr>
															<th>员工信息：</th>
															<th></th>
														</tr>
													</thead>
													<tbody>
														<tr>
															<td><b>员工姓名:</b></td>
															<td><input type="text" id="staffName" name="staffName" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>员工年龄：</b></td>
															<td><input type="text" id="staffAge" name="staffAge" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>员工类型：</b></td>
															<td><input type="text" id="staffType" name="staffType" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>员工电话：</b></td>
															<td><input type="text" id="staffTele" name="staffTele" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>员工身份证号：</b></td>
															<td><input type="text" id="staffCardNumber" name="staffCardNumber" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>员工住址：</b></td>
															<td><input type="text" id="staffAdress" name="staffAdress" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>员工状态：</b></td>
															<td><input type="text" id="staffStatus" name="staffStatus" class="form-control"/></td>
														</tr>
													</tbody>
												</table>
												<div class="modal-footer">
													<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
													<input type="submit" value="提交" class="btn btn-primary">
												</div>
											</div>
										</form>
									</div>
								</div>
							</div>
							<!-- /.modal-dialog -->
						</div>
						<!-- /.modal -->
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/part/manager.js.jsp"></jsp:include>
</body>
</html>