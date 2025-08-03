<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html>
<html>
<head>

    <title>${faculty !=null ? 'Edit Faculty' : 'Add Faculty'}</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-100 flex items-center justify-center min-h-screen">

    <div class="bg-white shadow-lg rounded-lg w-full max-w-lg p-8">
        <h2 class="text-2xl font-semibold text-gray-800 mb-6 text-center">
        <c:choose>
            <c:when test="${faculty != null}">Edit Faculty</c:when>
            <c:otherwise>Add Faculty</c:otherwise>
        </c:choose>
        </h2>

        <form action="addFacultyServlet" method="post">
			<c:if test="${faculty != null}">
            <input type="hidden" name="id" value="${faculty.id}" />
        	</c:if>
        
            <div class="mb-5">
                <label class="block text-gray-700 text-sm font-medium mb-2">Faculty Name</label>
                <input type="text" name="name" required
                	value="${faculty != null ? faculty.name : ''}"
                       class="w-full px-4 py-2 border border-gray-300 rounded focus:outline-none focus:ring-2 focus:ring-orange-500"/>
            </div>

            
            <div class="mb-6">
                <label class="block text-gray-700 text-sm font-medium mb-2">Remarks</label>
                <textarea name="remarks" rows="3"
                          class="w-full px-4 py-2 border border-gray-300 rounded focus:outline-none focus:ring-2 focus:ring-orange-500">${faculty != null ? faculty.remarks : ''}</textarea>
            </div>

            
            <div class="flex justify-between items-center">
                <button type="submit"
                        class="bg-green-600 hover:bg-green-700 text-white font-semibold px-5 py-2 rounded">
	                    <c:choose>
	                    <c:when test="${faculty != null}">Update Faculty</c:when>
	                    <c:otherwise>Add Faculty</c:otherwise>
	                	</c:choose>
                </button>
                 <a href="<c:url value='/home'/>"
				   class="text-sm text-gray-600 hover:text-orange-600 transition font-medium">
				   ⬅️ Back to List
				</a>
            </div>
        </form>
    </div>

</body>
</html>
