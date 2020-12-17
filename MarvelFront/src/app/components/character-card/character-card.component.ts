import { Component, Input, OnInit } from '@angular/core';
import { MarvelApiService } from 'src/app/services/marvel-api.service';

@Component({
  selector: 'app-character-card',
  templateUrl: './character-card.component.html',
  styleUrls: ['./character-card.component.css']
})
export class CharacterCardComponent implements OnInit {

  @Input() character : any;
  favorite : boolean;

  constructor(private marvelApiService : MarvelApiService) { }

  ngOnInit(): void {
  }

  /**
   * Action when click on the favorite button
   * Put on the superteam list and return id of the character save
   */
  onClick() {
    // this.marvelApiService.saveCharacter(this.character.id).subscribe(id => id);
    this.favorite = !this.favorite;
  }

}
