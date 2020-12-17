<?php

//Les dades arriben d'un formulari per post o get, en el nostre cas get
$costat_curt = $argv[1];
$caracter = $argv[2];

for($i = 0; $i< $costat_curt; $i++){
    for($j = 0; $j < $costat_curt*2; $j++){
        if($i ==0 OR $i == $costat_curt-1 OR $j==0 OR $j==($costat_curt*2)-1){
            print $caracter;
        }
        else{
            print " ";
        }
    }
    print "\n";
}
?>
