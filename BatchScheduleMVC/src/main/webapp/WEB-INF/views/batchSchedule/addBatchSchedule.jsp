<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<c:url value="/batchSchedule/add" var="addLink" ></c:url>


<style type="text/css">
fieldset.for-panel {
	background-color: #fcfcfc !important;
	border: 2px solid #999;
	border-radius: 4px;
	padding: 15px 10px;
	background-color: #d9edf7;
	border-color: #bce8f1;
	background-color: #f9fdfd;
	margin-bottom: 12px;
	padding-left: 75px;
	padding-right: 10px;
}

fieldset.for-panel legend {
	background-color: #fafafa;
	border: 1px solid #ddd;
	border-radius: 5px;
	color: #4381ba;
	font-size: 14px;
	font-weight: bold;
	line-height: 10px;
	margin: inherit;
	padding: 7px;
	width: auto;
	background-color: #d9edf7;
	margin-bottom: 0;
}
.danger{
	color : red;
}
</style>

</head>
<body>
	<fieldset class="for-panel">
			<legend>Add Batch Schedule</legend>
			<form:form action="${ addLink }" modelAttribute="batchSchedule">
				<div class="form-group">
					<div class="col-sm-6">
						<div class="form-horizontal">
							<div class="form-group row">
							<form:errors cssClass="danger" path="*" />
								<label class="col-xs-5 control-label">Batch Code:</label>
								<form:input cssClass="form-control input-field" path="batchCode" />
								<form:errors cssClass="danger" path="batchCode" />
							</div>
							<div class="form-group row">
								<label class="col-xs-5 control-label">Trainer First Name: </label>
								<form:input cssClass="form-control input-field"	path="trainerDetailsDTO.personDetailsDTO.firstName" />
								<form:errors cssClass="danger" path="trainerDetailsDTO.personDetailsDTO.firstName" />
							</div>
							<div class="form-group row">
								<label class="col-xs-5 control-label">Trainer Last Name:</label>
								<form:input cssClass="form-control input-field"	path="trainerDetailsDTO.personDetailsDTO.lastName" />
								<form:errors cssClass="danger" path="trainerDetailsDTO.personDetailsDTO.firstName" />
							</div>
							<div class="form-group row">
								<label class="col-xs-5 control-label">Center: </label>
								<form:input cssClass="form-control input-field" path="center" />
								<form:errors cssClass="danger" path="center" />
							</div>
							<div class="form-group row">							
								<label class="col-xs-5 control-label">Lab:</label>
								<form:input cssClass="form-control input-field" path="lab" />
								<form:errors cssClass="danger"  path="lab" />
							</div>
						</div>
					</div>
					<div class="col-sm-6">
						<div class="form-horizontal">
							<div class="form-group row">
								<label class="col-xs-4 control-label">StartDate:</label>
								<form:input cssClass="form-control input-field" type="date" path="startDate"  />
								<form:errors cssClass="danger" path="startDate" />
							</div>
							<div class="form-group row">	
								<label class="col-xs-4 control-label">EndDate:</label>
      						    <form:input class="form-control" type="date" path="endDate" />
      						    <form:errors cssClass="danger" path="endDate" />
							</div>
							<div class="form-group row">
								<label class="col-xs-4 control-label">Batch Timing:</label>
								<form:input cssClass="form-control input-field" path="timing" />
								<form:errors cssClass="danger" path="timing" />
							</div>
							<div class="form-group row">
								<label class="col-xs-4 control-label">Duration:</label>
								<form:input cssClass="form-control input-field" path="duration" />
								<form:errors cssClass="danger" path="duration" />
							</div>
							<div class="form-group row">
								<label class="col-xs-4 control-label">Is Completed:</label>
								<form:input cssClass="form-control input-field" path="completed" />
								<form:errors cssClass="danger" path="completed" />
							</div>
						</div>
					</div>
					<div >
						<div class="form-group row  col-sm-offset-5">
							 <input type="submit" class="btn btn-success" value="Submit" style="width: 200px;">
						</div>
					</div>
				</div>
			</form:form>
		</fieldset>
</body>
