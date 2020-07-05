<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link href="https://fonts.googleapis.com/css?family=Lato:100,300,400,700,900" rel="stylesheet">

        <link rel="stylesheet" href="css/icon-font.css">
        <link rel="stylesheet" href="style.css">
        <link rel="shortcut icon" type="image/png" href="img/favicon.png">

        <title>GoTo</title>
    </head>
    <body>
      <header class="header">

        
          <div class="logo-box">
            <img src="logo.png" alt="Logo" class="logo">
          </div>
          <div class="text-box">
            <h1 class="heading-primary">
            <span class="heading-primary-main">Dobro dosli!</span>
            </h1>
            <p class="pasos">Na ovoj web stranici moci cete izbjeci mukotrpno desifrovanje reda voznje. Unosenjem dva broja,
              prvi koji predstavlja broj stanice sa koje polazite a drugi broj stanice na koju zelite stici,Na stranici će biti generisano vrijeme
              za koje će autobus biti tu zajedno sa brojem autobusa koji će se uskoro naći na vašoj stanici.
              Brojevi su označeni na mapama. Pored te mogucnosti takodjer mozete izabrati i opciju unosenja broja
              stanice i broja autobusa (po redu voznje) koji Vam je potreban. 
               </p>
        </div>
          
      </header>  

<nav>
  
  <div class="map">
    <p>Mape</p>
    <ul>
      <li><img src="1.png" alt="mapa Irac-Slatina" class="mapa"></li>
      <li><img src="2.png" alt="mapa Slatina-Skver" class="mapa"></li>
      <li><img src="3.png" alt="mapa Skver-Panonska jezera" class="mapa"></li>
    </ul>
  </div>    
</nav>
        

<div class="forma">

<form  method="post" action="GotoServlet">

<table>
  <tr>
    <td style='font-size: 20px;'>Broj stanice na kojoj se nalazite: </td>
    <td ><input type="number" size="2" min="1" max="10" name="brTrenutne" style='font-size: 20px;' required/></td>
  </tr>
  <tr>
    <td style='font-size: 20px;'>Broj stanice do koje idete: </td>
    <td ><input type="number" size="2" min="1" max="10" name="brOdredista" style='font-size: 20px;' required/></td>
  </tr>
</table>
<div class="dugme"><input type="submit" name="submit"   style='border-radius: 20px; color: rgb(255, 255, 255); background-color: rgb(175, 32, 7); margin-left: 75px; width:100px; height:40px;border: darkgoldenrod;'/></div>
</form>

</div>


    </body>
</html>