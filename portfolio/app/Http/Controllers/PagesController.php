<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class PagesController extends Controller
{
    //* 3 Cara mengirim value ke Blade
    //? #1 compact(‘namavariabel’)
    public function home()
    {
        $title = "My Portfolio - Home";
        return view("pages.home", compact('title'));
    }
    //? #2 ->with(‘namavar’, ‘vardikirim’)
    public function about()
    {
        $title = "About Me";
        return view("pages.about")->with('title', $title);
    }
    public function education()
    {
        $title = "Education";
        return view("pages.education")->with('title', $title);
    }
    //? #3 ->with(‘namavar’, ‘var_array_dikirim’)
    public function project()
    {
        $data = array(
            'title' => "Our Projects",
            'projects' => [
                'Web Design',
                'Mobile Apps Development',
                'Desktop Apps Development'
            ]
        );
        return view("pages.project")->with($data);
    }
}
