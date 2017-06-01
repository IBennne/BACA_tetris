<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<form method="post">
	<input type="hidden" name="tetrimino_id" value="${ tetrimino.id }" />
	
	<div class="input-field">
		<input id="tetrimino_nom" type="text" class="validate" name="tetrimino_nom" value="${ tetrimino.nom }" />
		<label for="tetrimino_nom">Nom</label>
	</div>
	
	<div class="input-field">
		<input id="tetrimino_couleur" type="text" class="validate" name="tetrimino_couleur" value="${ tetrimino.couleur }" />
		<label for="tetrimino_couleur">Couleur</label>
	</div>
	
	<button class="btn waves-effect waves-light" type="submit">
		Valider <i class="material-icons right">send</i>
	</button>
</form>