<%@ page contentType="text/html" pageEncoding="utf-8" %>


    <!DOCTYPE html>
    <html lang="es">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Informacion Lector</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet" href="styles.css">
    </head>


    <body>

        <header>
            <nav class="navbar navbar-expand-lg bg-body-tertiary">
    
                <a class="navbar-brand" href="">
                    <img src="./media/icono.gif" alt="LogoLibro" width="60"></a>
    
    
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
    
                        <li class="nav-item">
                            <a class="nav-link" href="index.html">Lectores</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="libros.html">Libros</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="prestamos.html">Prestamos</a>
                        </li>
                    </ul>
    
                </div>
                </div>
            </nav>
    
        </header>

        <div id="titulos">
            <h1>Biblioteca barrial - Base de datos</h1>
    
        </div>


        <section id="S1">
            <div class="mb-4  mt-4 justify-content-center">
                <h2>Lector</h2>

            </div>
        </section>



        <section id="S3">

            <div>

                <div class="input-group mb-3 justify-content-center">
                    <span class="input-group-text" id="inputGroup-sizing-default">Id</span>
                    <input type="text" class="form-control" aria-label="Sizing example input"
                        aria-describedby="inputGroup-sizing-default" value="${c.getId()}">
                </div>

                <div class="input-group mb-3 justify-content-center">
                    <span class="input-group-text" id="inputGroup-sizing-default">Apellido</span>
                    <input name="apellido" type="text" class="form-control" aria-label="Sizing example input"
                        aria-describedby="inputGroup-sizing-default" value="${c.getApellido()}">
                </div>

                <div class="input-group mb-3 justify-content-center">
                    <span class="input-group-text" id="inputGroup-sizing-default">Nombre</span>
                    <input name="nombre" type="text" class="form-control" aria-label="Sizing example input"
                        aria-describedby="inputGroup-sizing-default" value="${c.getNombre()}">
                </div>

                <div class="input-group mb-3 justify-content-center">
                    <span class="input-group-text" id="inputGroup-sizing-default">Contacto</span>
                    <input name="contacto" type="text" class="form-control" aria-label="Sizing example input"
                        aria-describedby="inputGroup-sizing-default" value="${c.getContacto()}">
                </div>

            </div>

        </section>


        <section id="S2">
            <div class="mb-4  mt-4"></div>
        </section>

    </body>

    </html>