cd ../..
./recompile.sh
./reobfuscate.sh
jar Mcf "soup_mod-1.6.4-v1.0.jar" -C src/minecraft/ assets/soup -C src/minecraft/ mcmod.info -C reobf/minecraft/ com 
