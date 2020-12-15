import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { GLOBAL} from '@env/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MarcaService {
  public url: string;

  constructor(
    public _http:HttpClient
  ) { 
    this.url = GLOBAL.urlOscar;
  }

  getMarcas(): Observable<any>{
    return this._http.get( this.url + '/marcas');
  }

  getMarca(id): Observable<any>{
    return this._http.get( this.url + '/marcas' + id);
  }

  createMarca( data){
    const headers = new HttpHeaders().set('Content-Type', 'application/json');
    let json = JSON.stringify({
      "nombre": data.nombre
    });
    let params =json;
    return this._http.post( 
      this.url + '/marcas/', 
      JSON.stringify(data), 
      {headers: headers}
    );
  }

  updateMarca( id, data){
    const headers = new HttpHeaders().set('Content-Type', 'application/json');
    let json = JSON.stringify({
      "_id": data._id,
      "nombre": data.nombre
    });
    let params =json;
    return this._http.put( 
      this.url + '/marcas/' + id, 
      JSON.stringify(data), 
      {headers: headers}
    );
  }

  deleteMarca( id, data){
    const headers = new HttpHeaders().set('Content-Type', 'application/json');
    // Ignorar data por los momentos
    return this._http.put( 
      this.url + '/marcas/' + id + '/eliminar', 
      JSON.stringify(data), 
      {headers: headers}
    );
  }
}
