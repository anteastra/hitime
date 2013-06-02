<!DOCTYPE html>
<html lang="ru">
  <head>
    <title>hi time</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
	<link href="css/my.css" rel="stylesheet" media="screen">
  </head>
  <body>
	<div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container-fluid">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href="#">HiTime</a>
          <div class="nav-collapse collapse">
          	<ul class="nav" id="menu-layoutit">
						<li class="divider-vertical"></li>
						<li>
						  <div class="btn-group" data-toggle="buttons-radio">
								<button type="button" id="edit" class="btn btn-small btn-primary active"><i class="icon-edit icon-white"></i> Edit</button>
								<button type="button" class="btn btn-small btn-primary" id="devpreview"><i class="icon-eye-close icon-white"></i> Developer view</button>
								<button type="button" class="btn btn-small btn-primary" id="sourcepreview"><i class="icon-eye-open icon-white"></i> Preview</button>
							</div>
							<div class="btn-group">
								<button type="button" class="btn btn-small btn-primary" data-target="#downloadModal" rel="/build/downloadModal" role="button" data-toggle="modal"><i class="icon-chevron-down icon-white"></i>Download</button>
								<button class="btn btn-small btn-primary" href="/share/index" role="button" data-toggle="modal" data-target="#shareModal"><i class="icon-share icon-white"></i> Share or Save</button>
								<button class="btn btn-small btn-primary" href="#clear" id="clear"><i class="icon-trash icon-white"></i> Clear</button>
							</div>
							<!--div class="btn-group">
								<button class="btn btn-primary" href="#undo" id="undo" ><i class="icon-arrow-left icon-white"></i> Undo</button>
								<button class="btn btn-primary" href="#redo" id="redo" ><i class="icon-arrow-right icon-white"></i> Redo</button>
							</div-->
						</li>
					</ul>
            <p class="navbar-text pull-right">
              Logged in as <a href="#" class="navbar-link">Username</a>
            </p>
            <ul class="nav">
              <li class="active"><a href="#">Home</a></li>
              <li><a href="#about">About</a></li>
              <li><a href="#contact">Contact</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>
    <br>
    <div class="container-fluid">
	<div class="row-fluid">
		<div class="span4">
			<p>
				Welcome to the task tracker HiTime. In case of emergency you can contact with developer by skype "anteastra"
			</p>
		</div>
		<div class="span2">
		</div>
		<div class="span3">
			<ul class="nav nav-list">
				<li class="nav-header">
					List header
				</li>
				<li class="active">
					<a href="#">Home</a>
				</li>
				<li>
					<a href="#">Library</a>
				</li>
				<li>
					<a href="#">Applications</a>
				</li>
				<li class="nav-header">
					Another list header
				</li>
				<li>
					<a href="#">Profile</a>
				</li>
				<li>
					<a href="#">Settings</a>
				</li>
				<li class="divider">
				</li>
				<li>
					<a href="#">Help</a>
				</li>
			</ul>
		</div>
		<div class="span3">
			<ul class="nav nav-list">
				<li class="nav-header">
					List header
				</li>
				<li class="active">
					<a href="#">Home</a>
				</li>
				<li>
					<a href="#">Library</a>
				</li>
				<li>
					<a href="#">Applications</a>
				</li>
				<li class="nav-header">
					Another list header
				</li>
				<li>
					<a href="#">Profile</a>
				</li>
				<li>
					<a href="#">Settings</a>
				</li>
				<li class="divider">
				</li>
				<li>
					<a href="#">Help</a>
				</li>
			</ul>
		</div>
	</div>
</div>
	
 	<script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>