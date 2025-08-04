<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>${department != null ? 'Edit Department' : 'Add Department'}</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-100 flex items-center justify-center min-h-screen">

    <div class="bg-white shadow-lg rounded-lg w-full max-w-2xl p-8">
        <h2 class="text-2xl font-semibold text-gray-800 mb-6 text-center">
            <c:choose>
                <c:when test="${department != null}">Edit Department</c:when>
                <c:otherwise>Add Department</c:otherwise>
            </c:choose>
        </h2>

        <form action="addDepartmentServlet" method="post">
            <c:if test="${department != null}">
                <input type="hidden" name="id" value="${department.id}" />
            </c:if>
			
			
			 <div class="mb-6">
                <label class="block text-gray-700 text-sm font-medium mb-2">Select Faculty</label>
                <select name="faculty_id" required
                        class="w-full px-4 py-2 border border-gray-300 rounded focus:outline-none focus:ring-2 focus:ring-blue-500">
                    <option value="">-- Select Faculty --</option>
                    <c:forEach var="faculty" items="${faculties}">
                        <option value="${faculty.id}"
                                <c:if test="${department != null && department.facultyId == faculty.id}">selected</c:if>>
                            ${faculty.name}
                        </option>
                    </c:forEach>
                </select>
            </div>
            
            <!-- Name -->
            <div class="mb-5">
                <label class="block text-gray-700 text-sm font-medium mb-2">Department Name</label>
                <input type="text" name="name" required
                       value="${department != null ? department.name : ''}"
                       class="w-full px-4 py-2 border border-gray-300 rounded focus:outline-none focus:ring-2 focus:ring-blue-500"/>
            </div>

            <!-- Code -->
            <div class="mb-5">
                <label class="block text-gray-700 text-sm font-medium mb-2">Code</label>
                <input type="text" name="code" required
                       value="${department != null ? department.code : ''}"
                       class="w-full px-4 py-2 border border-gray-300 rounded focus:outline-none focus:ring-2 focus:ring-blue-500"/>
            </div>

            <!-- Email -->
            <div class="mb-5">
                <label class="block text-gray-700 text-sm font-medium mb-2">Email</label>
                <input type="email" name="email"
                       value="${department != null ? department.email : ''}"
                       class="w-full px-4 py-2 border border-gray-300 rounded focus:outline-none focus:ring-2 focus:ring-blue-500"/>
            </div>

            <!-- Phone -->
            <div class="mb-5">
                <label class="block text-gray-700 text-sm font-medium mb-2">Phone</label>
                <input type="text" name="phone"
                       value="${department != null ? department.phone : ''}"
                       class="w-full px-4 py-2 border border-gray-300 rounded focus:outline-none focus:ring-2 focus:ring-blue-500"/>
            </div>

         
            <!-- Buttons -->
            <div class="flex justify-between items-center">
                <button type="submit"
                        class="bg-green-600 hover:bg-green-700 text-white font-semibold px-5 py-2 rounded">
                    <c:choose>
                        <c:when test="${department != null}">Update Department</c:when>
                        <c:otherwise>Add Department</c:otherwise>
                    </c:choose>
                </button>

                <a href="<c:url value='/getDepartment'/>"
                   class="text-sm text-gray-600 hover:text-blue-600 transition font-medium">
                    ⬅️ Back to Department List
                </a>
            </div>
        </form>
    </div>

</body>
</html>
