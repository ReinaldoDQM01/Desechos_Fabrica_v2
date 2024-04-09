<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/styles.css">
    <link rel="stylesheet" href="css/fontello.css">
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.min.js"></script>
    title>${title}</title>
</head>

<body>
    <div class="main-container">
        <nav class="" id="main-nav">
            <ul>
                <li>
                    <a>
                        <i class="icon-industrial-building me-2"></i> Productores
                    </a>
                </li>
                <li>
                    <a>
                        <i class="icon-trash-1 me-2"></i>Envases
                    </a>
                </li>
                <li>
                    <a>
                        <i class="icon-truck me-2"></i> Vehiculos
                    </a>
                </li>
                <li>
                    <a>
                        <i class="icon-warehouse me-2"></i>Transportistas
                    </a>
                </li>
            </ul>
        </nav>
        <main class="w-100">
            <section class="content">
                <jsp:include page="${pageContent}" />
            </section>
        </main>
    </div>
</body>

</html>