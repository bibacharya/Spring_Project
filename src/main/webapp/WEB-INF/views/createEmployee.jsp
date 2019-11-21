<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management Form</title>
</head>
<body>
	<div Class= "container">
		<form action="save_employee" method="post">
			<fieldset>
				<legend>Employee Management</legend>
				<div class="form-group">
					<label>Emp_Name</label>
					<input type = "text" name = "empName" class="form-controll">
				</div>
				<div class="form-group">
					<label>Dob</label>
					<input type = "date" name = "dob" class ="form-controll">
				</div>
				<div class="form-group">
					<label>Hire_Date</label>
					<input type = "date" name = "hiredDate" class ="form-controll">
				</div>
				<div class="form-group">
					<label>Address</label>
					<input type = "text" name = "address" class ="form-controll">
				</div>
				<div class="form-group">
					<label>Department</label>
					<input type = "text" name = "department" class ="form-controll">
				</div>
				<div class="form-group">
					<label>Position</label>
					<input type = "text" name = "position" class ="form-controll">
				</div>
				<div class="form-group">
					<label>Gender</label>
					<input type = "radio" name = "gender" value ="Male">Male
					<input type = "radio" name =gender" value ="Female">Female
				</div>
				<div class="form-group">
					<label>Salary</label>
					<input type = "number" name = "salary" class ="form-controll">
				</div>
				<div class="form-group">
					<label>Email</label>
					<input type = "email" name = "email" class ="form-controll">
				</div>
				
				<div class = "form-group">
					<input type="submit" value = "Submit" class="btn_success">
				</div>
		
			</fieldset>
		
		</form>
	</div>

</body>
</html>