import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { CharacterService } from './character.service';
import { CharacterComponent } from './character/character.component';

@NgModule({
  declarations: [
    AppComponent, CharacterComponent,
  ],
  imports: [
    BrowserModule, FormsModule, HttpModule
  ],
  providers: [CharacterService],
  bootstrap: [AppComponent]
})
export class AppModule { }
