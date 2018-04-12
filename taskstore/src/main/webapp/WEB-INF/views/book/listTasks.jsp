<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>List Of Task</title>

<link rel="stylesheet"
	href='<c:url value="/web-resources/lib/bootstrap-3.3.6/css/bootstrap.min.css"/>'>

<link rel="stylesheet"
	href='<c:url value="/web-resources/lib/jquery/jquery-ui-1.10.4.custom.css"/>'>

<style type="text/css">
th {
	text-align: left
}

.ui-dialog-buttonpane {
	display: none;
}
</style>


</head>

<body>
	<div style="width: 95%; margin: 0 auto;">

		<div id="bookDialog" style="display: none;">
			<%@ include file="bookForm.jsp"%>
		</div>

		<h1>List Of Tasks</h1>

		<button class="btn btn-primary" onclick="addBook()">
			<span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Add
			Task
		</button>
		<br>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th width="4%">S.N</th>
					<th width="12%">Task Name</th>
					<th width="12%">Task Description</th>
					<th width="12%">Creation Date</th>
					<th width="12%"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${taskList}" var="task" varStatus="loopCounter">
					<tr>
						<td><c:out value="${loopCounter.count}" /></td>
						<td><c:out value="${task.name}" /></td>
						<td><c:out value="${task.description}" /></td>
						<td><c:out value="${task.dateCreated}" /></td>

						<td><nobr>
								<button class="btn btn-primary" onclick="editBook(${task.id});">
									<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
									Edit
								</button>

								<a class="btn btn-primary" 	onclick="return confirm('Are you sure you want to delete this task?');"
									href="delete/${task.id}"> 
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
									Delete
								</a>

							</nobr></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

	<!--  It is advised to put the <script> tags at the end of the document body so they don't block rendering of the page -->
	<script type="text/javascript"
		src='<c:url value="/web-resources/lib/jquery/jquery-1.10.2.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/lib/jquery/jquery-ui-1.10.4.custom.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/lib/jquery/jquery.ui.datepicker.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/lib/bootstrap-3.3.6/js/bootstrap.min.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/js/js-for-listBooks.js"/>'></script>
</body>
</html>