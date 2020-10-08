child_of(joe, ralf).
child_of(mary, joe).
child_of(steve, joe).

aea(R1,R2,X):-
    R1 == isMage(X),
    R2 == isRangue(X)
    -> X is lion.


isMage(lion).
isMage(necro).
isMage(queen).

mageHater(antimage).

isMele(antimage).
isMele(sven).
isMele(terror).

isRangue(terror).
isRangue(lion).
isRangue(queen).
isRangue(necro).
isRangue(templar).

isDead(lion).
isDead(necro).


descendent_of(X, Y) :-
    child_of(X, Y).
descendent_of(X, Y) :-
    child_of(Z, Y),
    descendent_of(X, Z).