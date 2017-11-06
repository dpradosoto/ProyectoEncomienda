<%-- 
    Document   : encomienda
    Created on : 31-oct-2017, 18:57:44
    Author     : Darto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Encomienda</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script>
            $(document).ready(function () {
                $('.dropdown a.test').on("click", function (e) {
                    $(this).next('ul').toggle();
                    e.stopPropagation();
                    e.preventDefault();
                });
            });
        </script>

        <style type=text/css media=screen>

            #headercontainer{
                width: 100%;
                padding-bottom: 10px;

            }




        </style>


    </head>

    <body>

        <header>

            <div id="headercontainer" class="container" >
                <div  class="row">
              

                    <nav   class="navbar navbar-inverse navbar-cutom-menu">
                        <div class="container-fluid">
                         
                           
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                                    <span class="sr-only">Toggle navigation</span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                               
                                <a  href="index.jsp" class="navbar-brand brand " style="padding-top: 0px" >
                                    <img src="images/pepa.webp" alt="Logo UNAB" style="height:50px ; width:50px ; margin-left: 5px ;  ; padding-bottom: 0px " >
                                </a>

                            </div>
                                
                          
                            <div  class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" style="padding-bottom: 10px">
                                      

                                <ul class="nav navbar-nav navbar-right">
                                    <li><a href="encomienda.jsp">Encomienda</a></li>
                                    <li><a href="#">Traking</a></li>
                                    <li class="dropdown">
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Servicios <span class="caret"></span></a>
                                        <ul class="dropdown-menu">
                                            <li><a href="#">Servicio A</a></li>
                                            <li><a href="#">Servicio B</a></li>
                                            
                                            <li role="separator" class="divider"></li>

                                        </ul>

                                </ul>
                            </div>
                           
                            
                        </div>
                    </nav>

                </div>
            </div>
        </header>

        <div class=" container">          

            <div>

                <iframe  width="600" height="550"  class="embed-responsive-item col-sm-5 col-xs-12 " src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1664.771855116723!2d-70.61586352953265!3d-33.4351384863393!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x54cf17d9cfb58729!2sUNAB+-+Campus+Antonio+Varas!5e0!3m2!1ses!2ses!4v1499227659550" style="border:0; margin-bottom: 13px; margin-top: 10px;" allowfullscreen></iframe>

            </div>       

            <div class="col-xs-12 col-lg-7 aside">
                <div class="well row">
                    <center>
                        <h3>Caracterisicas de la Encomienda</h3>     
                        <div class="col-sm-4 col-lg-6">                
                            <form name="form" method="post" action="Control_empl">




                                <div class="form-group">
                                    <label for="Tipo">Tipo Encomienda</label>
                                    <div>
                                        <select class="form-control" name="departamento">
                                            <option value="">Seleccione Tipo</option>
                                            <option value="Sobre">Sobre</option>
                                            <option value="Caja">Caja</option>
                                        </select>
                                    </div>
                                </div>

                                <div class="well row">
                                    <h5>Tamaño (Cm.)</h5> 
                                    <div class="form-group ">
                                        <label for="rut">Largo:</label>
                                        <input type="text" class="form-control" name="largo">
                                    </div>
                                    <div class="form-group">
                                        <label for="nombre">Alto:</label>
                                        <input type="text" class="form-control" name="alto">

                                    </div>
                                      <div class="form-group">
                                        <label for="nombre">Ancho:</label>
                                        <input type="text" class="form-control" name="ancho">

                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="direccion">Peso:</label>
                                    <input type="text" class="form-control" name="peso">
                                </div>


                                <div class="form-group">
                                    <label for="Sbase">Direccion Retiro:</label>
                                    <input type="text" class="form-control" name="Dretiro">
                                </div>

                                



                            </form>

                        </div>
                    </center>   

                    <div class="col-sm-8 col-lg-6">            
                        <div class="form-group">

                            <div class="form-group">
                                <label for="Sbase">Direccion Envío:</label>
                                <input type="text" class="form-control" name="Dretiro">
                            </div>
                            <div class="form-group">
                                <label for="Sbase">Nombre Receptor:</label>
                                <input type="text" class="form-control" name="Dretiro">
                            </div>

                            <label for="carga">Metodo de Pago</label>
                            <div>
                                <select class="form-control" name="cargo">
                                    <option value="">Eliga un Metodo</option>
                                    <option value="basica">Efectivo</option>
                                    <option value="media">Tarjeta Credito</option>
                                    <option value="superior">Tarjeta Debito</option>
                                </select>
                            </div>
                        </div> 



                    </div>
                    <button type="submit" class="btn btn-primary btn-block " name="enviar" value="enviar"> 
                                    <span class="glyphicon glyphicon-send" aria-hidden="true"></span>  Enviar Solicitud</button>
                </div>
            </div>


    </body>

</html>

