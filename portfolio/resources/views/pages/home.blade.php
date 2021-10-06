{{-- extend akan mengganti setiap bagian (section) layout. Content yang ditulis pada layout dapat disertakan menggunakan directive @parent dalam section --}}
@extends('layouts.app')
@include('layouts.navigation')

{{-- Directive @section mendefinisikan bagian (section) isi halaman web --}}
@section('content')
    <div class="jumbotron jumbotron-fluid">
        <div class="container">
            <h1 class="display-4">Home Page</h1>
            <p class="lead">This is Home Page of the Portfolio Website.</p>
        </div>
    </div>
@endsection
