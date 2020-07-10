<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
<title>房间管理</title>
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
								<font size="4">房间信息管理</font> 
								<a href="<%=basePath%>showcustomers.do"> 
									<span class="glyphicon glyphicon-repeat"></span>
								</a>
								<span style="float: right">
									<button type="button" class="btn btn-default btn-sm"
										data-toggle="modal" data-target="#myModal" onclick="editInfo(this,0)">
										<span class="glyphicon glyphicon-plane"></span> 新增顾客信息
									</button>
								</span>
							</div>
							<!-- 面板体放：表格内容，按照dataTable格式来构造-->
							<div class="panel-body">
								<div class="table-responsive">
									<table class="table table-striped table-bordered table-hover"
										id="dataTables-example">
										<thead>
											<tr>
												<th>房间编号</th>
												<th>房间类型</th>
												<th>房间门牌号</th>
												<th>房间状态</th>
												<th>修改</th>
												<th>删除</th>
											</tr>
										</thead>
										<tbody>
											<c:if test="${not empty list }">
												<c:forEach var="room" items="${list }">
													<tr>
														<td>${room.roomId }</td>
														<td>${room.roomType }</td>
														<td>${room.roomNumber }</td>
														<td>${room.roomStatus }</td>
														<td><a id="edit" href="#" data-toggle="modal" data-target="#myModal" onclick="editInfo(this,1)">
															<span class="glyphicon glyphicon-edit"></span>
														</a></td>
														<td><a href="javascript:doDelete(${room.roomId })" style="color:red">
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
											<input type="hidden" id="customerId" name="customerId" class="form-control">
											<div class="form-group">
												<table class="table" style="font: '黑体';">
													<thead>
														<tr>
															<th>房间信息：</th>
															<th></th>
														</tr>
													</thead>
													<tbody>
														<tr>
															<td><b>房间门牌号:</b></td>
															<td><input type="text" id="roomNumber" name="roomNumber" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>房间类型：</b></td>
															<td><select id="roomType" name="roomType" class="form-control">
																<!--举例-->
																<option>大床房</option>
																<option>标准房</option>
															</select>
															</td>
														</tr>
														<tr>
															<td><b>房间状态：</b></td>
															<td><select id="roomStatus" name="roomStatus" class="form-control">
																<option>已删除</option>
																<option>空闲中</option>
																<option>预订中</option>
																<option>入住中</option>
															</select> 
															</td>
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
<script type="text/javascript">
	function editInfo(obj,flag){
		if(flag==0){
			//$(".form-control").val("");
			$("#editForm").get(0).reset();
			$("#editForm").attr("action","<%=basePath%>addroom.do");
		}else{
			$("#editForm").attr("action","<%=basePath%>modifyroom.do");
			var roomInfo = obj.parentNode.parentNode.childNodes;
			console.log(roomInfo);
			$("#roomId").val(customerInfo[1].innerHTML);
			$("#roomType").val(customerInfo[3].innerHTML);
			$("#roomNumber").val(customerInfo[5].innerHTML);
			$("#roomStatus").val(customerInfo[7].innerHTML);
		}
	}
	
	function doDelete(roomId){
		if(confirm("您确定要删除编号为："+customerId+"的顾客信息吗？")){
			location.href="<%=basePath%>removeroom.do?roomId=" + roomId;
		}
	}
</script>
</html>