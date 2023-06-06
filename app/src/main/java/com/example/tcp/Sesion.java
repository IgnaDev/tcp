package com.example.tcp;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(foreignKeys = {@ForeignKey(entity = Categoria.class,
        parentColumns = "idCategoria",
        childColumns = "idCategoria",
        onDelete = 5,
        onUpdate = 5)},
        indices = {@Index(value = {"nombre"},
                unique = true)})

public class Sesion implements Serializable {
    @PrimaryKey(autoGenerate = true)
    public int idSesion;
    @NonNull
    public String nombre;

    public String descripcion;

    @NonNull
    public int idCategoria;

}
