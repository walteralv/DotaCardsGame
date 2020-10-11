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
    write('Responda las siguiente preguntas para recomendarle un heroe :]'),
    caracteristicas(los_heroes_con_transformaciones),
    caracteristicas(los_heroes_con_clones),
    caracteristicas(los_personajes_inspirados_en_demonios),write('Te recomendamos Terrorblade').
lion:-
    caracteristicas(los_magos),
    caracteristicas(los_leones),
    caracteristicas(los_insta_killers),write('Te recomendamos lion').
winranger:-
    caracteristicas(las_arqueras),
    caracteristicas(las_elfas),
    caracteristicas(personajes_que_usan_viento_en_ataques),
    write('Te recomendamos Winranger').
templar:-
    caracteristicas(los_guerreros_psiquico),
    caracteristicas(los_acolitos),
    caracteristicas(los_personajes_con_mascaras),write('Te recomendamos Templar').
sven:-
    caracteristicas(las_espadas),
    caracteristicas(los_heroes_que_matan_de_un_golpe),
    caracteristicas(los_heroes_que_se_hacen_fuertes_con_su_ira),write('Te recomendamos Sven').

juggernaut:-
    caracteristicas(los_samurais),
    caracteristicas(los_ataques_con_giros),
    caracteristicas(las_mascaras),
    write('Te recomendamos juggernaut').
axe:-
    caracteristicas(xd),
    caracteristicas(los_ataques_con_giros),
    caracteristicas(las_mascaras),write('Te recomendamos axe').

%preguntas
preguntar(Pregunta):-
    write('A usted le gusta ' ),
    write(Pregunta),
    write('?'),
    read(Respuesta),
    nl,
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


deshacer:-retract(si(_)),fail.
deshacer:-retract(no(_)),fail.
deshacer.

mano:-    heroe(X),
    write(' como su primero heroe'),deshacer.