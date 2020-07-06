<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="DTO.Autobus"%>
<%@ page import="java.util.ArrayList" %>
<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Autobusi i vremena</title>
  <meta content="" name="descriptison">
  <meta content="" name="keywords">

  
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

 
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Roboto:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

 
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/icofont/icofont.min.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="assets/vendor/venobox/venobox.css" rel="stylesheet">
  <link href="assets/vendor/aos/aos.css" rel="stylesheet">

  
  <link href="assets/css/style.css" rel="stylesheet">
<style>
body{
background: linear-gradient(45deg, rgba(86, 58, 250, 0.9) 0%, rgba(116, 15, 214, 0.9) 100%), url("../img/hero-bg.jpg") center center no-repeat;
  background-size: cover;
}
  .mapa{
    height:30%;
    width: 100%;
    padding-bottom: 20px;
    
}
</style>
 
</head>

<body>

 
  <header id="header" class="fixed-top " style="background: linear-gradient(45deg, rgba(86, 58, 250, 0.9) 0%, rgba(116, 15, 214, 0.9) 100%), url("../img/hero-bg.jpg") center center no-repeat;
  background-size: cover;">
    <div class="container-fluid">

      <div class="row justify-content-center">
        <div class="col-xl-9 d-flex align-items-center">
          <h1 class="logo mr-auto"><a href="index.jsp"><img src="logo.png" alt=""></a></h1>
          
           

          <nav class="nav-menu d-none d-lg-block">
            <ul>
              <li><a href="index.jsp">Home</a></li>
              <li><a class="disabled" href=" #about">About</a></li>
              <li><a href="#services">Mape</a></li>
              <li><a href="#contact">Proslijedi stanicu</a></li>

            </ul>
          </nav>
        </div>
      </div>

    </div>
  </header>

 
  <div class="tabela" style="background:white;  padding-top:100px;">
  
  <div class="container">

        <div class="row">
          <div class="col-lg-6 "  >
            <img src="sat.gif" alt="" style="width:350px; height:300px;padding-left:50px;">
          </div>
          <div class="col-lg-6" >
            <h3>Napomena</h3>
            <p class="font-italic">
             Vrijeme dolaska autobusa je relativno. Najcesca kasnjenja su u periodima:
            </p>
            <ul>
              <li><i class="icofont-check-circled"></i> 7:30-8:30</li>
              <li><i class="icofont-check-circled"></i> 12:00-13:00</li>
              <li><i class="icofont-check-circled"></i> 16:00-17:00</li>
            </ul>
           
          </div>
        </div>

      </div>
  
  <br>
  <br>
  <p>Autobusi koji ce biti na vasoj stanici</p>
             
  <table class="table table-striped " style="background:white;  padding-top:150px;">
    <thead>
      <tr>
        <th>Broj autobusa</th>
        <th>Vrijeme dolaska</th>
        <th>Dan</th>
      </tr>
    </thead>
    <tbody>
    <% 
	ArrayList<Autobus> autobusi = new ArrayList<Autobus>();
	autobusi= (ArrayList<Autobus>)request.getAttribute("autobusi");
		for (int i=0; i<autobusi.size(); i++)
		{%>  <tr>
        <td><%out.println(autobusi.get(i).getBr_autobusa());%></td>
        <td><%out.println(autobusi.get(i).getVrijemeNaTrenutnoj());%></td>
        <td></td>
      </tr>
 		<%}%>
 	
     
   
    				</tbody>
 	 			</table>
  </div>
 
  <footer id="footer">

    <div class="footer-top" style="padding-top:30px;">
      <div class="container">
        <div class="row">

          <div class="col-lg-3 col-md-6 footer-contact">
            <h3>GoTo</h3>
            <p>
              Tuzla <br>
              BiH, Tuzla 75000<br>
              Bosna i Hercegovina <br><br>
              <strong>Phone:</strong> 06033333333<br>
              <strong>Email:</strong> goto@example.com<br>
            </p>
          </div>

          

        </div>
      </div>
    </div>
</footer>
   

</body>
</html>
  
  
  
  
  
  
  
  
  
  
  
  
  	
	
	
	




