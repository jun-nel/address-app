package dev.jun.core.controller;

import dev.jun.App;

public abstract class Controller {
    protected App app;

    public void load(App application) {
        this.app = application;

        load_fields();
        load_bindings();
        load_listeners();
    }

    protected abstract void load_fields();

    protected abstract void load_bindings();

    protected abstract void load_listeners();
}