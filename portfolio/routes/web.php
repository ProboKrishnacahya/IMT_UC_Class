<?php

use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

//* Routing Web Pages
Route::get('/', function () {
    return view("pages.home");
});
// Route::get('/', "PagesController@home");

Route::get('/about', function () {
    return view("pages.about");
});
// Route::get('/about', "PagesController@about");

Route::get('/education', function () {
    return view("pages.education");
});
// Route::get('/education', "PagesController@education");

Route::get('/project', function () {
    return view("pages.project");
});
// Route::get('/project', "PagesController@project");

Route::get('/users/{id}', function ($id) {
    return "ID pengguna: ".$id;
});

Route::get('/users/{id}/{nama}', function ($id, $nama) {
    return "Pengguna ".$nama." memiliki ID pengguna ".$id;
});

//* Dapat diakses secara global
Route::get('blade', function () {
	return view('child');
});

//* Shortcut Routing untuk Artisan -resource
Route::resource('/post','PostController');

Route::resource('posts','PostsController');
