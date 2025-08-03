<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Faculty List</title>
<link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-100 p-8">
<div class="max-w-5xl mx-auto bg-white shadow rounded p-6">
<div class="text-center mb-6">
        <h1 class="text-3xl font-bold text-blue-700">CAMPUS</h1>
    </div>
        <div class="flex justify-between items-center mb-6">
            <h1 class="text-2xl font-semibold text-gray-800">Faculty List</h1>
            <a href="addFacultyForm" class="bg-green-500 text-white py-2 px-4 rounded hover:bg-green-600 transition">
                Add New Faculty
            </a>
        </div>
        
        <div class= "overflow-x-auto">
        	<table class = "min-w-full table-auto text-sm text-gray-800 border border-gray-200">
        		<thead class="bg-gray-100 text-left">
        			<tr>
                        <th class="px-5 py-3 border-b border-gray-200">ID</th>
                        <th class="px-5 py-3 border-b border-gray-200">Name</th>
                        <th class="px-5 py-3 border-b border-gray-200">Remarks</th>
                        <th class="px-5 py-3 border-b border-gray-200 text-center">Actions</th>
                    </tr>
        		</thead>
        		<tbody>
        		 <c:forEach var="faculty" items="${faculties}">
                        <tr class="hover:bg-gray-50 transition">
                            <td class="px-5 py-3 border-b">${faculty.id}</td>
                            <td class="px-5 py-3 border-b">${faculty.name}</td>
                            <td class="px-5 py-3 border-b">${faculty.remarks}</td>
                            <td class="px-5 py-3 border-b text-center">
                                <div class="flex justify-center gap-3">
                                    <a href="addFacultyForm?id=${faculty.id}"
                                       class="bg-blue-300 text-gray-900 px-4 py-1 rounded hover:bg-yellow-400 transition">
                                        Edit
                                    </a>
                                    
                                    <form action="deleteFaculty" method="post"
                                          onsubmit="return confirm('Are you sure you want to delete this faculty?')">
                                        <input type="hidden" name="id" value="${faculty.id}" />
                                        <button type="submit"
                                                class="bg-red-400 text-white px-4 py-1 rounded hover:bg-red-500 transition">
                                            Delete
                                        </button>
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