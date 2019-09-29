import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { tap } from 'rxjs/operators';
import { NativeStorage } from '@ionic-native/native-storage/ngx';
import { EnvService } from './env.service';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  isLoggedIn = false;
  token: any;
  constructor(
    private http: HttpClient,
    private storage: NativeStorage,
    private env: EnvService) {

  }

  login(email: String, password: String) {

    let mock = 'assets/mock/user.json';
    let token = 123;

    this.storage.setItem('token', token).then(() => {
      console.log('Token Stored');
    }, error => console.error('Error storing item', error)
    );

    this.token = token;
    this.isLoggedIn = true;
    return this.http.get<User>(mock);

    return this.http.post(this.env.API_URL + '/login',
      { email: email, password: password }).pipe(
        tap(token => {
          this.storage.setItem('token', token).then(() => {
            console.log('Token Stored');
          }, error => console.error('Error storing item', error)
          );
          this.token = token;
          this.isLoggedIn = true;
          return token;
        }),
      );
  }

  register(fName: String, lName: String, email: String, password: String) {
    return this.http.post(this.env.API_URL + '/registration',
      { fName: fName, lName: lName, email: email, password: password }
    )
  }

  logout() {
    const headers = new HttpHeaders({
      'Authorization': this.token["token_type"] + " " + this.token["access_token"]
    });

    let mock = 'assets/mock/logout.json';

    return this.http.get(mock, { headers: headers })
      .pipe(tap(data => {
        this.storage.remove("token");
        this.isLoggedIn = false;
        delete this.token;
        return data;
      })
      )

    return this.http.get(this.env.API_URL + 'auth/logout', { headers: headers })
      .pipe(tap(data => {
        this.storage.remove("token");
        this.isLoggedIn = false;
        delete this.token;
        return data;
      })
      )
  }

  user() {
    const headers = new HttpHeaders({
      'Authorization': this.token["token_type"] + " " + this.token["access_token"]
    });

    let mock = '/assets/mock/user.json';

    return this.http.get<User>(mock).pipe(tap(user => {
      return user;
    })
    )

    // return this.http.get<User>(this.env.API_URL + 'auth/user', { headers: headers })
    //   .pipe(tap(user => {
    //     return user;
    //   })
    //   )
  }

  getToken() {
    return this.storage.getItem('token').then(data => {
      this.token = data;
      if (this.token != null) {
        this.isLoggedIn = true;
      } else {
        this.isLoggedIn = false;
      }
    }, error => {
      this.token = null;
      this.isLoggedIn = false;
    });
  }
}