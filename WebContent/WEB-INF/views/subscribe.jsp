<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<form method="post">
	<input type="hidden" name="subscribe_id" value="${ subscribe.id }" />
	
	<div class="input-field">
		
		<input id="name" type="text" class="validate" name="subscribe_nom" value="${ subscribe.nom }" /> 
		<label for="subscribe_nom">Votre nom</label>
	</div>
	<div class="input-field">
		
		<input id="name" type="text" class="validate" name="subscribe_prenom" value="${ subscribe.prenom }" />
		<label for="subscribe_prenom">Votre prénom</label>
	</div>
	<div class="input-field">
		<i class="material-icons prefix">account_circle</i>
		<input id="name" type="text" class="validate" name="subscribe_username" value="${ subscribe.username }" />
		<label for="subscribe_username">Votre pseudo</label>
	</div>
	<div class="input-field">
		<i class="material-icons prefix">vpn_key</i>
		<input id="password" type="password" class="validate" name="subscribe_password" value="${ subscribe.password }" />
		<label for="subscribe_password">Votre mot de passe</label>
	</div>
	<div class="input-field">
		<i class="material-icons prefix">vpn_key</i>
		<input id="password" type="password" class="validate" name="subscribe_password2"  value="${ subscribe.password2}"/>
		<label for="subscribe_password2">Verification mot de passe</label>
	</div>
	<!--commentaire essai  -->
	
	<button class="btn waves-effect waves-light" type="submit">
		OK <i class="material-icons right">send</i>
	</button>
</form>
