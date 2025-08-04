<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student</title>
    <link rel="stylesheet" href="static/css/style.css">
</head>
<body>
<div class="container">
  <div class="left">

    <h2>Student Details</h2>

    <form action="actionStudentForm" method="post">

      <label for="faculty-select">Select Faculty</label><br />
		<select id="faculty-select" name="facultyId">
		  <option value="">-- Select Faculty --</option>
		  <c:forEach var="faculty" items="${facultyList}">
		    <option value="${faculty.id}" <c:if test="${faculty.id == selectedFacultyId}">selected</c:if>>
		      ${faculty.name}
		    </option>
		  </c:forEach>
		</select>
		
		<label for="department-select">Select Department</label><br />
		<select id="department-select" name="deptId">
		  <option value="">-- Select Department --</option>
		  <c:forEach var="dept" items="${departmentList}">
		    <option value="${dept.id}" <c:if test="${dept.id == selectedDeptId}">selected</c:if>>
		      ${dept.name}
		    </option>
		  </c:forEach>
		</select>
		
		<label for="batch-select">Select Batch</label><br />
		<select id="batch-select" name="batchId">
		  <option value="">-- Select Batch --</option>
		  <c:forEach var="batch" items="${batchList}">
		    <option value="${batch.id}" <c:if test="${batch.id == selectedBatchId}">selected</c:if>>
		      ${batch.name}
		    </option>
		  </c:forEach>
		</select>


      <script>
       
        document.getElementById("faculty-select").addEventListener("change", function () {
          var facultyId = this.value;
          window.location.href = "studentView?facultyId=" + facultyId;
        });

        document.getElementById("department-select").addEventListener("change", function () {
          var facultyId = document.getElementById("faculty-select").value;
          var deptId = this.value;
          window.location.href = "studentView?facultyId=" + facultyId + "&deptId=" + deptId;
        });

        document.getElementById("batch-select").addEventListener("change", function () {
          var facultyId = document.getElementById("faculty-select").value;
          var deptId = document.getElementById("department-select").value;
          var batchId = this.value;
          window.location.href = "studentView?facultyId=" + facultyId + "&deptId=" + deptId + "&batchId=" + batchId;
        });
      </script>

		<label>ID</label><br />
		<input type="text" name="studentId" value="${passStudent.id}" readonly />
		
		<label>Name</label><br />
		<input type="text" name="studentName" value="${passStudent.name}" />
		
		<label>Roll Number</label><br />
		<input type="text" name="studentRoll" value="${passStudent.rollNum}" />
		
		<label>Email</label><br />
		<input type="text" name="studentEmail" value="${passStudent.email}" />
		
		<label>Phone</label><br />
		<input type="text" name="studentPhone" value="${passStudent.phone}" />
		
		<label>Gender</label><br />
		<select name="gender">
		  <option value="">Select Gender</option>
		  <option value="Male" <c:if test="${passStudent.gender == 'Male'}">selected</c:if>>Male</option>
		  <option value="Female" <c:if test="${passStudent.gender == 'Female'}">selected</c:if>>Female</option>
		</select>
		
		<label>Date of Birth</label><br />
		<input type="text" name="dob" value="${passStudent.dateOfBirth}" />
		
		<label>Address</label><br />
		<textarea name="address" rows="2">${passStudent.address}</textarea>
		
		<label>Admission Date</label><br />
		<input type="text" name="admission" value="${passStudent.admission}" />
		
		<label>Remarks</label><br />
		<input type="text" name="remarks" value="${passStudent.remarks}" />

      <div class="buttons">
        <button type="submit" class="add" value="add" name="submit">Add</button>
        <button type="submit" class="update" value="update" name="submit">Update</button>
        <button type="submit" class="delete" value="delete" name="submit">Delete</button>
        <button type="submit" class="clear" value="clear" name="submit">Clear</button>
      </div>

    </form>
  </div>

  <div class="right scroll">
    <h2>Student List</h2>
    <c:forEach var="student" items="${studentList}">
      <div class="faculty-item ${student.id eq selectedStudentId ? 'active' : ''}">
        <a href="studentView?facultyId=${selectedFacultyId}&deptId=${selectedDeptId}&batchId=${selectedBatchId}&studentId=${student.id}"
           style="text-decoration: none !important; color: inherit !important;">
          ${student.name}
        </a>
      </div>
    </c:forEach>
  </div>
</div>
</body>
</html>
