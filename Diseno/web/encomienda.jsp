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

        <link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:400,300,200' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyD_W8mld_uEkqGGPDa83Z_S28VDmwISWeo&libraries=places"></script>



        <script>




            var placeSearch, autocomplete, autocomplete_textarea, autocomplete2, autocomplete_textarea2;
            function initialize() {
                // Cree el objeto de autocompletado, restringiendo la búsqueda
                autocomplete = new google.maps.places.Autocomplete(
                        (document.getElementById('autocomplete')),
                        {types: ['geocode']});

                autocomplete2 = new google.maps.places.Autocomplete(
                        (document.getElementById('autocomplete2')),
                        {types: ['geocode']});
                // Cuando el usuario selecciona una dirección en el menú desplegable,
                // rellena los campos de dirección en el formulario.
                google.maps.event.addListener(autocomplete, 'place_changed', function () {
                    fillInAddress();
                });
                google.maps.event.addListener(autocomplete2, 'place_changed', function () {
                    fillInAddress();
                });


                autocomplete_textarea = new google.maps.places.Autocomplete((document.getElementById('autocomplete_textarea')),
                        {types: ['geocode']}
                );

                autocomplete_textarea2 = new google.maps.places.Autocomplete((document.getElementById('autocomplete_textarea')),
                        {types: ['geocode']}
                );

                google.maps.event.addListener(autocomplete_textarea, 'place_changed', function () {
                    fillInAddress_textarea();
                });
                google.maps.event.addListener(autocomplete_textarea2, 'place_changed', function () {
                    fillInAddress_textarea();
                });
            }

            function fillInAddress_textarea() {
                var place = autocomplete_textarea.getPlace();
                console.log(place.formatted_address);
                console.log(JSON.stringify(place));
                $('#autocomplete_textarea').val(place.formatted_address);
                var place2 = autocomplete_textarea.getPlace();

                console2.log(place2.formatted_address);
                console2.log(JSON.stringify(place2));
                $('#autocomplete_textarea2').val(place2.formatted_address);
            }





     //ubicación geográfica del usuario,

            function geolocate() {
                if (navigator.geolocation) {
                    navigator.geolocation.getCurrentPosition(function (position) {
                        var geolocation = new google.maps.LatLng(
                                position.coords.latitude, position.coords.longitude);
                        var circle = new google.maps.Circle({
                            center: geolocation,
                            radius: position.coords.accuracy
                        });
                        autocomplete.setBounds(circle.getBounds());
                        autocomplete_textarea.setBounds(circle.getBounds());
                        autocomplete2.setBounds(circle.getBounds());
                        autocomplete_textarea2.setBounds(circle.getBounds());
                    });
                }
            }
        </script>






        <style type=text/css media=screen>

            #headercontainer{
                width: 100%;
                padding-bottom: 10px;

            }




        </style>


    </head>

    <body onload="initialize()">

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
                                    <li><a href="#">User</a></li>
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
                <div class="well row" style=" margin-top: 10px;">

                    <form name="form" method="post" action="Servicio" >
                        <center>
                            <h3>Caracterisicas de la Encomienda</h3>     
                             <br>

                            <div class="col-sm-4 col-lg-6">                

                                <div class="form-group">
                                    <label for="Tipo">Tipo Encomienda</label>
                                    <div>
                                        <select class="form-control" name="Tipo">
                                            <option value="">Seleccione Tipo</option>
                                            <option value="Sobre">Sobre</option>
                                            <option value="Caja">Caja</option>
                                        </select>
                                    </div>
                                </div>


                                <div class="well row">
                                 
                                     <label for="largo">Largo:</label>  
                                    <div class="input-group">
                                        
                                        <input type="text" class="form-control" placeholder="Largo" name="largo" aria-describedby="basic-addon2">
                                        <span class="input-group-addon" id="basic-addon2">Cm.</span>
                                    </div>

                                    <label for="largo">Alto:</label>  
                                    <div class="input-group">
                                        
                                        <input type="text" class="form-control" placeholder="Alto" name="alto" aria-describedby="basic-addon2">
                                        <span class="input-group-addon" id="basic-addon2">Cm.</span>
                                    </div>
                                     
                                    <label for="largo">Ancho:</label>  
                                    <div class="input-group">
                                        
                                        <input type="text" class="form-control" placeholder="Ancho" name="ancho" aria-describedby="basic-addon2">
                                        <span class="input-group-addon" id="basic-addon2">Cm.</span>
                                    </div>
                                </div>

                                <label for="largo">Peso:</label>  
                                    <div class="input-group">
                                        
                                        <input type="text" class="form-control" placeholder="Peso" name="alto" aria-describedby="basic-addon2">
                                        <span class="input-group-addon" id="basic-addon2">Kg.</span>
                                    </div>
                                    <br>



                            </div>
                        </center>   

                        <div class="col-sm-8 col-lg-6">            
                            <div class="form-group">
                                <div class="form-group">
                                    <label for="Dretiro">Direccion Retiro:</label>
                                    <input id="autocomplete" laceholder="Donde Retiraremos la " onFocus="geolocate()" type="text"  class="form-control"  name="Dretiro">
                                </div>

                                <div class="form-group">
                                    <label for="Sbase">Direccion Envío:</label>
                                    <input id="autocomplete2" laceholder="Destino de la Encomienda" onFocus="geolocate()" type="text"  class="form-control" name="Denvio">
                                </div>
                                <div class="form-group">
                                    <label for="Sbase">Nombre Receptor:</label>
                                    <input type="text"   class="form-control" name="Receptor">
                                </div>

                                <label for="pago">Metodo de Pago</label>
                                <div>
                                    <select class="form-control" name="pago">
                                        <option value="">Eliga un Metodo</option>
                                        <option value="Efectivo">Efectivo</option>
                                        <option value="Tarjeta Credito">Tarjeta Credito</option>
                                        <option value="Tarjeta Debito">Tarjeta Debito</option>
                                    </select>
                                </div>
                            </div> 



                        </div>

                        <button type="submit" class="btn btn-primary btn-block " name="enviar" value="enviar" > 
                            <span class="glyphicon glyphicon-send" aria-hidden="true"></span>  Enviar Solicitud</button>
                    </form>
                    
                </div>
            </div>

        </div>


    </body>

</html>

