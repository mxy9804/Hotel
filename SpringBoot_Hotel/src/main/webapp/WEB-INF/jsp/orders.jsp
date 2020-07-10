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
<title>订单管理</title>
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
								<font size="4">订单管理</font> 
								<a href="<%=basePath%>showorders.do"> 
									<span class="glyphicon glyphicon-repeat"></span>
								</a>
								<span style="float: right">
									<button type="button" class="btn btn-default btn-sm"
										data-toggle="modal" data-target="#myModal" onclick="editInfo(this,0)">
										<span class="glyphicon glyphicon-plane"></span> 新增订单
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
												<th>订单编号</th>
												<th>前台（经办人）编号</th>
												<th>顾客姓名</th>
												<th>顾客电话</th>
												<th>房间类型</th>
												<th>房间价格（元/天）</th>	
												<th>房间号</th>				
												<th>入住日期</th>	
												<th>入住人数</th>
												<th>退房日期</th>
												<th>订单创建日期</th>
												<th>订单总价</th>
												<th>订单状态</th>																				
												<th>修改</th>
												<th>删除</th>
											</tr>
										</thead>
										<tbody>
											<c:if test="${not empty list }">
												<c:forEach var="order" items="${list }">
													<tr>
														<td>${order.orderId}</td>
														<td>${order.receptionId }</td>
														<td>${order.customerName }</td>
														<td>${order.customerTele }</td>
														<td>${order.typeName}</td>
														<td>${order.typePrice }</td>
														<td>${order.roomNumber }</td>
														<td><fmt:formatDate value="${order.checkinDate }" pattern="yyyy-MM-dd"/></td>
														<td>${order.customerNumber }</td>
														<td><fmt:formatDate value="${order.checkoutDate }" pattern="yyyy-MM-dd"/></td>														
														<td><fmt:formatDate value="${order.orderCredate }" pattern="yyyy-MM-dd"/></td>														
														<td>${order.orderPrice }</td>
														<td>${order.orderStatus }</td>
														<td><a id="edit" href="#" data-toggle="modal" data-target="#myModal" onclick="editInfo(this,1)">
															<span class="glyphicon glyphicon-edit"></span>
														</a></td>
														<td><a href="javascript:doDelete(${order.orderId })" style="color:red">
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
											<input type="hidden" id="orderId" name="orderId" class="form-control">
											<div class="form-group">
												<table class="table" style="font: '黑体';">
													<thead>
														<tr>
															<th>订单信息：</th>
															<th></th>
														</tr>
													</thead>
													<tbody>
														<tr>
															<td><b>前台（经办人）编号:</b></td>
															<td><input type="number" id="receptionId" name="receptionId" step="1" 
																maxlength="11" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>顾客姓名:</b></td>
															<td><input type="text" id="customerName" name="customerName" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>顾客电话:</b></td>
															<td><input type="text" id="customerTele" name="customerTele" class="form-control"/></td>
															
														</tr>
														<tr>
															<td><b>房间类型:</b></td>
															<td><select id="typeName" name="typeName" class="form-control">
																<option>服装</option>
																<option>家电</option>
																<option>食品</option>
																<option>日用品</option>
																<option>数码产品</option>
																<option>虚拟产品</option>
															</select>
														</tr>
														<tr>
															<td><b>房间价格（元/天）:</b></td>
															<td><input type="number" id="typePrice" name="typePrice" step="0.01" 
																maxlength="11" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>房间号:</b></td>
															<td><select id="roomNumber" name="roomNumber" class="form-control">
																<option>服装</option>
																<option>家电</option>
																<option>食品</option>
																<option>日用品</option>
																<option>数码产品</option>
																<option>虚拟产品</option>
															</select>
														</tr>
														<tr>
															<td><b>入住日期:</b></td>
															<td><input type="date" id="checkinDate" name="checkinDate" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>入住人数:</b></td>
															<td><input type="number" id="customerNumber" name="customerNumber" step="1" 
																maxlength="2" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>退房日期:</b></td>
															<td><input type="date" id="checkoutDate" name="checkoutDate" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>订单创建日期:</b></td>
															<td><input type="date" id="orderCredate" name="orderCredate" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>订单总价:</b></td>
															<td><input type="number" id="orderPrice" name="orderPrice" step="0.01" 
																maxlength="11" class="form-control"/></td>
														</tr>
														<tr>
															<td><b>订单状态:</b></td>										
														    <td><select id="orderStatus" name="orderStatus" class="form-control">
																<option>服装</option>
																<option>家电</option>
																<option>食品</option>
																<option>日用品</option>
																<option>数码产品</option>
																<option>虚拟产品</option>
															</select>
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
			$("#editForm").attr("action","<%=basePath%>addorder.do");
		}else{
			$("#editForm").attr("action","<%=basePath%>modifyorder.do");
			var customerInfo = obj.parentNode.parentNode.childNodes;
			console.log(customerInfo);
			$("#customerId").val(customerInfo[1].innerHTML);
			$("#customerName").val(customerInfo[3].innerHTML);
			$("#customerSex").val(customerInfo[5].innerHTML);
			$("#customerAge").val(customerInfo[7].innerHTML);
			$("#customerTele").val(customerInfo[9].innerHTML);
			$("#customerCardnumber").val(customerInfo[11].innerHTML);
		}
	}
	
	function doDelete(orderId){
		if(confirm("您确定要取消编号为："+orderId+"的订单吗？")){
			location.href="<%=basePath%>removeorder.do?orderId="+orderId;
		}
	}
</script>
</html>