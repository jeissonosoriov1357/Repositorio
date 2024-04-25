package com.example.repositorio;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.repositorio.databinding.ActivityProduccionMultimediaBinding;

public class ProduccionMultimediaActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityProduccionMultimediaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityProduccionMultimediaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarProduccionMultimedia.toolbar);
        binding.appBarProduccionMultimedia.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow, R.id.ingcivil, R.id.ing, R.id.nsr10,
                R.id.Plano, R.id.proyecto, R.id.prueba, R.id.reparar, R.id.resolucion, R.id.solido, R.id.suelo,
                R.id.unidad, R.id.vigas, R.id.zapata, R.id.fotogramakeyframe, R.id.gps2, R.id.guionliterario, R.id.herramientas2,
                R.id.icono2, R.id.imagenvectorial, R.id.imagotipo2, R.id.insertarimagen, R.id.logo2, R.id.mapajerarquico, R.id.mapalineal,
                R.id.objetos3d, R.id.onlineweb, R.id.paneldeherramientas, R.id.paneldeproyectos, R.id.paneles2, R.id.pistasdeaudio, R.id.pistasdevideo,
                R.id.pixel2, R.id.plano2, R.id.pluma2, R.id.propiedades2, R.id.prototipo2, R.id.puntero2, R.id.rgb2, R.id.resolucion2,
                R.id.rotacion2, R.id.sms2, R.id.sliderweb, R.id.storyboard2, R.id.telefonointeligente, R.id.tipodefuente, R.id.tipodeplano,
                R.id.transiciones2, R.id.varitamagica, R.id.webmaster, R.id.webservice, R.id.zoom2)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_produccion_multimedia);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.produccion_multimedia, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_produccion_multimedia);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}