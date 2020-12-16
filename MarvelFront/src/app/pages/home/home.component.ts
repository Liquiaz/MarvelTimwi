import { Component, OnInit } from '@angular/core';
import { MarvelApiService } from 'src/app/services/marvel-api.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  characters : any;

  constructor(private marvelApiService : MarvelApiService) { }

  ngOnInit(): void {
    this.getAllCharacters();
  }

  getAllCharacters(){
    this.marvelApiService.getAllCharacters().subscribe(data => this.characters = data);
  }

}
