<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Batch</title>
    <link rel="stylesheet" href="static/css/style.css">
</head>
<body>
<div class="container">
  <div class="left">

    <h2>Batch Details</h2>
    <form action="actionBatchForm" method="post">
      <div class="select-row">

        <div class="select-group">
          <label for="faculty-select">Select Faculty</label><br />
          <select id="faculty-select" name="facultyId">
            <option value="">Select Faculty</option>
            <c:forEach var="faculty" items="${facultyList}">
              <option value="${faculty.id}" <c:if test="${faculty.id == selectedFacultyId}">selected</c:if>>
                ${faculty.name}
              </option>
            </c:forEach>
          </select>
        </div>

        <div class="select-group">
          <label for="department-select">Select Department</label><br />
          <select id="department-select" name="departmentId">
            <option value="">Select Department</option>
            <c:forEach var="dept" items="${departmentList}">
              <option value="${dept.id}" <c:if test="${dept.id == selectedDepartmentId}">selected</c:if>>
                ${dept.name}
              </option>
            </c:forEach>
          </select>
        </div>

      </div>

     <label>ID</label><br />
		<input type="text" id="batch-id" name="batchId" value="${passBatch.id}" readonly />
		<label>Name</label><br />
		<input type="text" id="batch-name" name="batchName" value="${passBatch.name}" />
		<label>Start Year</label><br />
		<input type="text" id="start-year" name="startYear" value="${passBatch.startYear}" />
		<label>End Year</label><br />
		<input type="text" id="end-year" name="endYear" value="${passBatch.endYear}" />
		<label>Remarks</label><br />
		<input type="text" id="batch-remarks" name="remarks" value="${passBatch.remarks}" />

      <div class="buttons">
        <button type="submit" class="add" value="add" name="submit">Add</button>
        <button type="submit" class="update" value="update" name="submit">Update</button>
        <button type="submit" class="delete" value="delete" name="submit">Delete</button>
        <button type="submit" class="clear" value="clear" name="submit">Clear</button>
      </div>
    </form>
  </div>
  
  <div class="right scroll">
    <h2>Batch List</h2>
  <c:forEach var="batch" items="${batchList}">
  	<div class="faculty-item ${batch.id == passBatch.id ? 'active' : ''}">
    	<a href="batchView?facultyId=${selectedFacultyId}&departmentId=${selectedDepartmentId}&batchId=${batch.id}" style="text-decoration: none !important; color: inherit !important;">
    	  ${batch.name}
    	</a>
  </div>
</c:forEach>


  </div>
</div>

<script>
  document.getElementById("faculty-select").addEventListener("change", function () {
    var facultyId = this.value;
    window.location.href = "batchView?facultyId=" + facultyId;
  });

  document.getElementById("department-select").addEventListener("change", function () {
    var departmentId = this.value;
    var facultyId = document.getElementById("faculty-select").value;
    window.location.href = "batchView?facultyId=" + facultyId + "&departmentId=" + departmentId;
  });
</script>
</body>
</html>
