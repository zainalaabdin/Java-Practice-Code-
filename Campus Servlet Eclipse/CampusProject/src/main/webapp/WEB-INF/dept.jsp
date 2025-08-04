<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Department List</title>
<link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-100 p-8">
<div class="max-w-6xl mx-auto bg-white shadow rounded p-6">
    <div class="text-center mb-6">
        <h1 class="text-3xl font-bold text-blue-700">CAMPUS</h1>
    </div>
    
    <div class="flex justify-between items-center mb-6">
        <h1 class="text-2xl font-semibold text-gray-800">Department List</h1>
        <a href="addDepartmentForm" class="bg-green-500 text-white py-2 px-4 rounded hover:bg-green-600 transition">
		    Add New Department
		</a>
    </div>


	<form id="facultyForm" method="get" action="getDepartment" class="mb-4">
    <label for="facultyId" class="block text-sm font-medium text-gray-700 mb-2">Filter by Faculty</label>
    <select name="faculty_id" id="facultyId"
        class="w-full md:w-1/3 px-4 py-2 border border-gray-300 rounded-md shadow-sm focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-blue-500">
        <option value="">Select Faculty</option>
        <c:forEach var="faculty" items="${faculties}">
            <option value="${faculty.id}"
                <c:if test="${faculty.id == selectedFacultyId}">selected</c:if>>
                ${faculty.name}
            </option>
        </c:forEach>
    </select>
</form>

	<script>
	    document.getElementById('facultyId').addEventListener('change', function () {
	        document.getElementById('facultyForm').submit();
	    });
	</script>
	
 
    <div class="overflow-x-auto">
        <table class="min-w-full table-auto text-sm text-gray-800 border border-gray-200">
            <thead class="bg-gray-100 text-left">
                <tr>
                    <th class="px-4 py-3 border-b">ID</th>
                    <th class="px-4 py-3 border-b">Name</th>
                    <th class="px-4 py-3 border-b">Code</th>
                    <th class="px-4 py-3 border-b">Email</th>
                    <th class="px-4 py-3 border-b">Phone</th>
                    <th class="px-4 py-3 border-b">Faculty ID</th>
                    <th class="px-4 py-3 border-b text-center">Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="dept" items="${departments}">
                    <tr class="hover:bg-gray-50 transition">
                        <td class="px-4 py-3 border-b">${dept.id}</td>
                        <td class="px-4 py-3 border-b">${dept.name}</td>
                        <td class="px-4 py-3 border-b">${dept.code}</td>
                        <td class="px-4 py-3 border-b">${dept.email}</td>
                        <td class="px-4 py-3 border-b">${dept.phone}</td>
                        <td class="px-4 py-3 border-b">${dept.facultyId}</td>
                        <td class="px-4 py-3 border-b text-center">
                            <div class="flex justify-center gap-3">
                                <a href="addDepartmentForm?id=${dept.id}" class="bg-blue-300 text-gray-900 px-4 py-1 rounded hover:bg-yellow-400 transition">Edit</a>
                                <form action="deleteDepartment" method="post" onsubmit="return confirm('Are you sure you want to delete this department?')">
                                    <input type="hidden" name="id" value="${dept.id}" />
                                    <button type="submit" class="bg-red-400 text-white px-4 py-1 rounded hover:bg-red-500 transition">Delete</button>
                                </form>
                            </div>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
