aea:-
    write('me quiero morir'),
    heroe(Heroes),
    write('A usted mi amigo, le gusta '),
    write(Heroes),
    nl,
    write(' Este es su heroe'),deshacer.
%heroesc
heroe(terrorblade):-terrorblade.
heroe(lion):- lion.
heroe(winranger):-winranger.
heroe(templar):-templar.
heroe(sven):-sven.
heroe(juggernaut):-juggernaut.
heroe(axe):- axe.
%reglas de identificacion
terrorblade:-
    write('odio aqui man'),
    caracteristicas(las_espadas),
    caracteristicas(los_ataques_con_giros),
    caracteristicas(las_mascaras),write('Te recomendamos Terrorblade').
lion:-
    caracteristicas(los_magos),
    caracteristicas(los_furros),
    caracteristicas(los_insta_killers),write('Te recomendamos lion').
winranger:-
    caracteristicas(las_arquedas),
    caracteristicas(las_elfas),
    caracteristicas(personajes_que_usan_viento_en_ataques),write('Te recomendamos Winranger').
templar:-
    caracteristicas(los_guerreros_psiquico),
    caracteristicas(los_acolitos),
    caracteristicas(las_mascaras),write('Te recomendamos Templar').
sven:-
    caracteristicas(las_espadas),
    caracteristicas(los_heroes_que_matan_de_un_golpe),
    caracteristicas(aeamanos),write('Te recomendamos Sven').

juggernaut:-
    caracteristicas(las_espadas),
    caracteristicas(los_ataques_con_giros),
    caracteristicas(las_mascaras),
    write('Te recomendamos juggernaut').
axe:-
    caracteristicas(las_espadas),
    caracteristicas(los_ataques_con_giros),
    caracteristicas(las_mascaras),write('Te recomendamos axe').

%preguntas
preguntar(Pregunta):-
    write('Responda las preguntas para recomendar un primer heroe'),
    write(Pregunta),
    write('?'),
    read(Respuesta),
    n1,
   ((Respuesta == si)
   ->
   assert(si(Pregunta));
   assert(no(Pregunta)),fail).

:- dynamic si/1,no/1.

%verificar
caracteristicas(H):-
    (si(H)
    ->
    true;
    (no(H)
    ->
    fail;
    preguntar(H))).


deshacer:- retract(si(_)).fail.
deshacer:- retract(no(_)).fail.







