<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Department</title>
    <link rel="stylesheet" href="static/css/style.css">
</head>
<body>
     <div class="container">
  <div class="left">

    <h2>Department Details</h2>
    
  	<form action="actionDeptForm" method="post">
  	
    <label for="faculty-select">Select Faculty</label><br />
	<select id="faculty-select" name="facultyId">
  		<c:forEach var="faculty" items="${facultyList}">
    		<option value="${faculty.id}" <c:if test="${faculty.id == selectedFacultyId}">selected</c:if>>
      		${faculty.name}
    		</option>
  		</c:forEach>
	</select>
	
	<script>
    document.getElementById("faculty-select").addEventListener("change", function() {
        var facultyId = this.value;
        window.location.href = "departmentView?facultyId=" + facultyId;
    });
	</script>
	
	    <label>ID</label><br />
	    <input type="text" id="dept-id" name="deptId" value="${passDept.id}" readonly />
	    <label>Name</label><br />
	    <input type="text" id="name" name="deptname" value= "${passDept.name}"/>
	    <label>Code</label><br />
	    <input type="text" id="code" name="deptcode" value="${passDept.code}"/>
	    <label>Email</label><br />
	    <input type="text" id="email" name="deptemail" value="${passDept.email}"/>
	    <label>Phone</label><br />
	    <input type="text" id="phone" name="deptphone" value="${passDept.phone}"/>

    <div class="buttons">
                <button type="submit" class="add" value="add" name="submit">Add</button>
                <button type="submit" class="update" value="update" name="submit">Update</button>
                <button type="submit" class="delete" value="delete" name="submit">Delete</button>
                <button type="submit" class="clear" value="clear" name="submit">Clear</button>
    </div>
   	</form>
   
  </div>
 <div class="right scroll">
    <h2>Department List</h2>
    <c:forEach var="dept" items="${departmentList}">
    <div class="faculty-item ${dept.id eq selectedDeptId ? 'active' : ''}">
        <a href="departmentView?facultyId=${dept.facultyId}&deptId=${dept.id}" style="text-decoration: none !important; color: inherit !important;">
            ${dept.name}
        </a>
    </div>
	</c:forEach>
</div>

  </div>
</body>
</html>
