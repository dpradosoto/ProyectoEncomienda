<%-- 
    Document   : index
    Created on : 31-oct-2017, 18:52:22
    Author     : Darto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Principal</title>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
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
                                            <li><a href="#">Servicio C</a></li>
                                            <li role="separator" class="divider"></li>
                                            <li><a href="#">Todos los servicios</a></li>
                                        </ul>
                                    <li><a href="#">Contacto</a></li>

                                </ul>
                            </div>
                           
                            
                        </div>
                    </nav>

                </div>
            </div>
        </header>
        
        
        <div class="container">
                <div class="col-lg-12 col-sm-12">
                     <div class="well row">

        
              <div class="col-sm-12 col-lg-6 aside">                
                <img src="images/bajar.jpg" alt="" class="img-thumbnail">
              </div>
              <div class="col-sm-12 col-lg-6">            
                <center><h3>¿Como Trabajamos?</h3></center>
                <br>
                <br>
                <br>
               
                <br>
                <p class="text-justify">Consectetur adipisicing elit. Nisi molestias voluptatum vitae debitis voluptatibus magni perspiciatis voluptate laboriosam, totam reiciendis? Facere accusamus delectus fuga ipsum veritatis consectetur excepturi magni omnis.Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatem eius, similique ratione nam provident deserunt at suscipit dolor maiores sint. Magni doloribus hic, veniam minus blanditiis ipsa, reiciendis iure placeat.
Lorem ipsum dolor sit amet, consectetur adipisicing elit. Vel, beatae, deleniti dolorum accusantium animi iste quam eligendi quo suscipit consequuntur nobis harum maiores magni culpa illum deserunt saepe. Facilis, nihil!
Lorem ipsum dolor sit amet, consectetur adipisicing elit. Velit minus odio perspiciatis fuga quis est inventore sunt, quae illo, repellendus dolores! Repellat quas officiis consequatur nisi, rem dolores iure natus.</p>
              
              </div>
            </div>
          </div>
        
           
            
        
         </div>
        
    </body>
</html>
