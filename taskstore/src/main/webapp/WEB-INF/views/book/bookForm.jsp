<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:url var="actionUrl" value="save" />

<form:form id="taskForm" commandName="task" method="post"
	action="${actionUrl}" class="form-horizontal">

	<div class="form-group">
		<label for="name" class="col-xs-4 control-label"> Task Name</label>
		<div class="col-xs-8">
			<form:input name="name" path="name" placeholder="Task Name"
				class="form-control" />
		</div>
	</div>

	<div class="form-group">
		<label for="code" class="col-xs-4 control-label">Task
			Description</label>
		<div class="col-xs-8">
			<form:input name="description" path="description"
				placeholder="Task Description" class="form-control" />
		</div>
	</div>

	<div class="form-group" style="display:none;">
		<label for="name" class="col-xs-4 control-label"> Task Id</label>
		<div class="col-xs-8">
			<form:input name="id" path="id" placeholder="Task Name"
				class="form-control" />
		</div>
	</div>

	<button class="btn btn-primary">
			<span class="glyphicon glyphicon-plus" aria-hidden="true"></span> <span id="actionId">Action</span>
	</button>
	
	<form:input path="id" type="hidden" />
</form:form>