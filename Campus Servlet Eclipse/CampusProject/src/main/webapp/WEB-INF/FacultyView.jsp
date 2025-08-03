<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Faculty Management</title>
    <link rel="stylesheet" href="static/css/style.css">
</head>
<body>
    <div class="container">
		
        <div class="left">
        
            <h2>Faculty Details</h2>

            <form action="actionForm" method="post">
		    <label for="id">ID</label><br>
		    <input type="text" id="id" name="id" value="${passFaculty.id}" readonly /><br>
		
		    <label for="faculty">Faculty</label><br>
		    <input type="text" id="faculty" name="name"  value="${passFaculty.name}" /><br>
		
		    <label for="remarks">Remarks</label><br>
		    <input type="text" id="remarks" name="remarks" value="${passFaculty.remarks}" /><br>

            <div class="buttons">
                <button type="submit" class="add" value="add" name="submit">Add</button>
                <button type="submit" class="update" value="update" name="submit">Update</button>
                <button type="submit" class="delete" value="delete" name="submit">Delete</button>
                <button type="submit" class="clear" value="clear" name="submit">Clear</button>
            </div>
            </form>
            
        </div>

        <div class="right scroll">
            <h2>Faculty List</h2>
            <div id="clickfacultylist">
               <c:forEach var="faculty" items="${faculties}">
	               <div class="faculty-item ${passFaculty.id == faculty.id ? 'active' : ''}">
			           <a href="getFacultyView?id=${faculty.id}" style="text-decoration: none !important; color: inherit !important;">
					        ${faculty.name}
					    </a>
			      </div>
              </c:forEach>
            </div>
        </div>
    </div>

</body>
</html>
