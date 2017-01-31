import { Component, OnInit } from '@angular/core';
import {CharacterService} from "../character.service";
import {Character} from "./character";

@Component({
  selector: 'character',
  templateUrl: 'character.component.html',
  styleUrls: ['character.component.css'],
  providers: [CharacterService]
})

export class CharacterComponent implements OnInit {
  errorMessage: string;
  characters: Character[];

  constructor(private service: CharacterService) { }

  ngOnInit() {
    this.getCharacters();
  }

  getCharacters(): void {
    this.service.getCharacters()
      .subscribe(
        characters => this.characters = characters,
        error => this.errorMessage = <any>error);
  }

}
